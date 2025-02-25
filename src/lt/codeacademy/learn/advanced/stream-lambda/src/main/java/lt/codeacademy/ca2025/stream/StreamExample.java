package lt.codeacademy.ca2025.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lt.codeacademy.ca2025.dto.EmployeeForSodraDto;
import lt.codeacademy.ca2025.model.Employee;

public class StreamExample {

	private final BigDecimal TAX_RATE = BigDecimal.valueOf(0.20); // 20% tax
	private final BigDecimal INSURANCE_RATE = BigDecimal.valueOf(0.05); // 5% insurance

	public void demo() {
		List<Employee> employees = List.of(
				new Employee("Jonas", "Jonaitis", BigDecimal.valueOf(1000), 1, "Developer"),
				new Employee("Petras", "Petraitis", BigDecimal.valueOf(2000), 2, "Tester"),
				new Employee("Petras", "Petraitis", BigDecimal.valueOf(2500), 2, "HR"),
				new Employee("Antanas", "Antanaitis", BigDecimal.valueOf(3000), 3, "Manager"),
				new Employee("Kazys", "Kazaitis", BigDecimal.valueOf(4000), 4, "HR"),
				new Employee("Raze", "Kazaite", BigDecimal.valueOf(4000), 4, "HR"),
				new Employee("Ona", "Onaite", BigDecimal.valueOf(5000), 5, "Developer"));

		employees.stream()
				.filter(employee -> employee.getWorkExperience() > 1 && employee.getWorkExperience() <= 4)
				.filter(employee -> employee.getRole().equals("HR"))
				.filter(employee -> employee.getName().startsWith("P") || employee.getName().startsWith("R"))
				.map(employee -> {
					return new EmployeeForSodraDto(
							employee.getName() + " " + employee.getSurname(),
							calcNeto(employee.getSalary()));
				})
				.toList()
				.forEach(System.out::println);

		calculateSalarySum(employees);
	}

	private void calculateSalarySum(final List<Employee> employees) {
		final BigDecimal allEmployeeSalaryAmount = employees.stream()
				.filter(emp -> emp.getRole().contains("Developer"))
				.map(emp -> emp.getSalary())
				.map(salary -> calcNeto(salary))
				.reduce(BigDecimal::add)
				.orElse(BigDecimal.ZERO);

		System.out.println("Salary amount of all employees: " + allEmployeeSalaryAmount);
	}

	private BigDecimal calcNeto(final BigDecimal gross) {
		final BigDecimal tax = gross.multiply(TAX_RATE);
		final BigDecimal insurance = gross.multiply(INSURANCE_RATE);
		final BigDecimal netSalary = gross.subtract(tax.add(insurance));

		return netSalary;
	}
}
