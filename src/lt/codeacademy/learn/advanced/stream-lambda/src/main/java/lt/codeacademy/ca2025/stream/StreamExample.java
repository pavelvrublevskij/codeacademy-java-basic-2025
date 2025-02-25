package lt.codeacademy.ca2025.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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

		final List<EmployeeForSodraDto> forSodraDtos = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getWorkExperience() > 1
					&& employee.getWorkExperience() <= 4
					&& employee.getRole().equals("HR")
					&& (employee.getName().startsWith("P") || employee.getName().startsWith("R"))) {
				tranformToSodraDtoFrom(employee, forSodraDtos);
			}
		}

		for (EmployeeForSodraDto forSodraDto : forSodraDtos) {
			System.out.println(forSodraDto);
		}
	}

	private void tranformToSodraDtoFrom(final Employee employee, final List<EmployeeForSodraDto> forSodraDtos) {
		final EmployeeForSodraDto forSodraDto = new EmployeeForSodraDto(
				employee.getName() + " " + employee.getSurname(),
				calcNeto(employee.getSalary()));
		forSodraDtos.add(forSodraDto);
	}

	private BigDecimal calcNeto(final BigDecimal gross) {
		final BigDecimal tax = gross.multiply(TAX_RATE);
		final BigDecimal insurance = gross.multiply(INSURANCE_RATE);
		final BigDecimal netSalary = gross.subtract(tax.add(insurance));

		return netSalary;
	}
}
