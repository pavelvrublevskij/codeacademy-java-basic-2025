package lt.codeacademy.ca2025.controller;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lt.codeacademy.ca2025.dto.UserDto;
import lt.codeacademy.ca2025.mapper.UserDtoMapper;
import lt.codeacademy.ca2025.service.UserService;

@RequiredArgsConstructor
public class UserController {

	private final UserDtoMapper userDtoMapper;
	private final UserService userService;

	public List<UserDto> showAllUsers() {
		final List<UserDto> users = userService.getAllUsers().stream()
				.map(user -> userDtoMapper.mapToUserDto(user))
				.collect(Collectors.toList());

		users.forEach(user -> System.out.println(user.email()));

		return users;
	}
}
