package lt.codeacademy.ca2025.mapper;

import lt.codeacademy.ca2025.domain.User;
import lt.codeacademy.ca2025.entity.UserEntity;

public class UserMapper {

	public User mapToUser(UserEntity userEntity) {
		return new User(userEntity.getName(), userEntity.getSurname(), userEntity.getEmail(), userEntity.getPhone());
	}

	public UserEntity mapToUserEntity(User user) {
		return new UserEntity(null, user.getName(), user.getSurname(), null, user.getEmailAddress(), user.getPhoneNumber());
	}
}
