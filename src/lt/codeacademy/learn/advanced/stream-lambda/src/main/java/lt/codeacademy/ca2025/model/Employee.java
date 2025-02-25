package lt.codeacademy.ca2025.model;

import java.math.BigDecimal;

public class Employee {

	private final String name;
	private final String surname;
	private final BigDecimal salary;
	private final int workExperience;
	private final String role;

	public Employee(final String name, final String surname, final BigDecimal salary, final int workExperience, final String role) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.workExperience = workExperience;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public int getWorkExperience() {
		return workExperience;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Employee{");
		sb.append("name='").append(name).append('\'');
		sb.append(", surname='").append(surname).append('\'');
		sb.append(", salary=").append(salary);
		sb.append(", workExperience=").append(workExperience);
		sb.append(", role='").append(role).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
