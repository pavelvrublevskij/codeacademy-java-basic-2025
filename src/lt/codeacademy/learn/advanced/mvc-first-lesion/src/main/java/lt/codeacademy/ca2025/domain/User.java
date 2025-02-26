package lt.codeacademy.ca2025.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
public class User {
	private final String name;
	private final String surname;
	private final String emailAddress;
	private final String phoneNumber;
}
