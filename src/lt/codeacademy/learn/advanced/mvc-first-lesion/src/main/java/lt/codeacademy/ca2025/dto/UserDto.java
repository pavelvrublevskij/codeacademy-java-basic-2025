package lt.codeacademy.ca2025.dto;

public class UserDto {

	private final String fullName;  // vardas kartu su pavarde
	private final String email;
	private final String phone;

	public UserDto(final String fullName, final String email, final String phone) {
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("UserDto{");
		sb.append("fullName='").append(fullName).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
