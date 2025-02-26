package lt.codeacademy.ca2025.dao;

import java.util.List;
import lt.codeacademy.ca2025.entity.UserEntity;

public class UserDao {

	public void save(UserEntity userEntity) {
		// darom saugojima i duomenu saugykla
		userEntity.getPhone();

	}

	public void update(UserEntity userEntity) {

	}

	public void deleteById(Long id) {
		// daromas user trinimas pagal jo id
	}

	public UserEntity getById(Long id) {
		// gauti UserEntity objekta (duomenys is duomenu saugyklos) pagal jo id
		return null;
	}

	public UserEntity getByEmail(String email) {
		// gauti UserEntity objekta (duomenys is duomenu saugyklos) pagal jo emaila
		return null;
	}

	public List<UserEntity> getAll() {
		// gauti visa vartotoju sarasa is duomenu saugyklos
		final UserEntity userEntity = UserEntity.builder()
				.id(1L)
				.name("Jonas")
				.surname("Jonaitis")
				.password("123")
				.email("j@test.lt")
				.phone("1234567")
				.build();

		final UserEntity userEntity2 = UserEntity.builder()
				.id(2L)
				.name("Petras")
				.surname("Petraitis")
				.password("222")
				.email("p@test.lt")
				.phone("1234568")
				.build();

		return List.of(userEntity, userEntity2);
	}
}
