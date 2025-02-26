package lt.codeacademy.ca2025.mapper;

import lt.codeacademy.ca2025.domain.User;
import lt.codeacademy.ca2025.dto.UserDto;

public class UserDtoMapper {

	public UserDto mapToUserDto(User user) {
		return new UserDto(user.getName().concat(" ").concat(user.getSurname()), user.getEmailAddress(), user.getPhoneNumber());
	}
}

