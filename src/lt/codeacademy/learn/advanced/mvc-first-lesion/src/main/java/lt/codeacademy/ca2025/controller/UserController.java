package lt.codeacademy.ca2025.controller;

import java.util.List;
import java.util.stream.Collectors;
import lt.codeacademy.ca2025.dto.UserDto;
import lt.codeacademy.ca2025.mapper.UserDtoMapper;
import lt.codeacademy.ca2025.service.UserService;

public class UserController {

	private final UserDtoMapper userDtoMapper;
	private final UserService userService;

	public UserController(final UserDtoMapper userDtoMapper, final UserService userService) {
		this.userDtoMapper = userDtoMapper;
		this.userService = userService;
	}

	public List<UserDto> showAllUsers() {
		return userService.getAllUsers().stream()
				.map(user -> userDtoMapper.mapToUserDto(user))
				.collect(Collectors.toList());
	}
}
