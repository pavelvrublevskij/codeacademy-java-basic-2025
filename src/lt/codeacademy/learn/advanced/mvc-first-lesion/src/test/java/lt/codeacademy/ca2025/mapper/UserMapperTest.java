package lt.codeacademy.ca2025.mapper;

import org.junit.jupiter.api.Test;
import lt.codeacademy.ca2025.domain.User;
import lt.codeacademy.ca2025.entity.UserEntity;
import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

	@Test
	void mapToUserShoudReturnValidAnswer() {
		final UserEntity userEntity = UserEntity.builder()
				.name("Jonas")
				.surname("Jonaitis")
				.email("2j@test.tt")
				.build();
		final UserMapper userMapper = new UserMapper();

		final User user = userMapper.mapToUser(userEntity);

		assertEquals("Jonas", user.getName());
		assertEquals("Jonaitis", user.getSurname());
		assertEquals("2j@test.tt", user.getEmailAddress());
		assertNull(user.getPhoneNumber());
	}
}
