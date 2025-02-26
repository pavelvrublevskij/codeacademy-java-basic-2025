package lt.codeacademy.ca2025.domain;

public class User {
	private final String name;
	private final String surname;
	private final String emailAddress;
	private final String phoneNumber;

	public User(final String name, final String surname, final String emailAddress, final String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
