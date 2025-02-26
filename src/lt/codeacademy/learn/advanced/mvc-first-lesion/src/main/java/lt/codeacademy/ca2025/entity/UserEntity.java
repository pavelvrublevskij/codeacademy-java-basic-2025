package lt.codeacademy.ca2025.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class UserEntity {

	private final Long id;
	private final String name;
	private final String surname;
	private final String password;
	private final String email;
	private final String phone;
}

