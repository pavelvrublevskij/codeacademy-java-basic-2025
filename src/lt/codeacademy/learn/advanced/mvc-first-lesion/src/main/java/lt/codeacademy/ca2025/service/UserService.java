package lt.codeacademy.ca2025.service;

import java.util.List;
import java.util.stream.Collectors;
import lt.codeacademy.ca2025.dao.UserDao;
import lt.codeacademy.ca2025.domain.User;
import lt.codeacademy.ca2025.entity.UserEntity;
import lt.codeacademy.ca2025.mapper.UserMapper;

public class UserService {

	private final UserDao userDao;
	private final UserMapper userMapper;

	public UserService(final UserDao userDao, final UserMapper userMapper) {
		this.userDao = userDao;
		this.userMapper = userMapper;
	}

	public List<User> getAllUsers() {
		return userDao.getAll().stream()
				.map(userEntity -> userMapper.mapToUser(userEntity))
				.collect(Collectors.toList());
	}
}
