package lt.codeacademy.ca2025.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class UserEntity {

	private final Long id;
	private final String name;
	private final String surname;
	private final String password;
	private final String email;
	private final String phone;
}

