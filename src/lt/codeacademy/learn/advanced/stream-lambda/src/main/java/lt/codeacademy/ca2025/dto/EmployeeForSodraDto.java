package lt.codeacademy.ca2025.dto;

import java.math.BigDecimal;

public class EmployeeForSodraDto {

	private final String fullname; // name and surname together
	private final BigDecimal salaryNeto;

	public EmployeeForSodraDto(final String fullname, final BigDecimal salaryNeto) {
		this.fullname = fullname;
		this.salaryNeto = salaryNeto;
	}

	public String getFullname() {
		return fullname;
	}

	public BigDecimal getSalaryNeto() {
		return salaryNeto;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("EmployeeForSodraDto{");
		sb.append("fullname='").append(fullname).append('\'');
		sb.append(", salaryNeto=").append(salaryNeto);
		sb.append('}');
		return sb.toString();
	}
}
