package lt.codeacademy.ca2025.entity;

public class UserEntity {

	private final Long id;
	private final String name;
	private final String surname;
	private final String password;
	private final String email;
	private final String phone;

	public UserEntity(final Long id, final String name, final String surname, final String password, final String email, final String phone) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("UserEntity{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", surname='").append(surname).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
