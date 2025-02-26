package lt.codeacademy.ca2025.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class UserDto {
	private final String fullName;  // vardas kartu su pavarde
	private final String email;
	private final String phone;
}
