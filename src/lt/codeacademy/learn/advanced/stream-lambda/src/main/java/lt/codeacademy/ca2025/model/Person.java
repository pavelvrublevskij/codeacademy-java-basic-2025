package lt.codeacademy.ca2025.model;

public class Person {
	private final String firstname;
	private final String lastname;
	private String phone;
	private String address;

	public Person(final String firstname, final String lastname, final String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Person{");
		sb.append("firstname='").append(firstname).append('\'');
		sb.append(", lastname='").append(lastname).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append(", address='").append(address).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
