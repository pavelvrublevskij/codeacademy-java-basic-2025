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
		return List.of(
				new UserEntity(1L, "Jonas", "Jonaitis", "123", "j@test.lt", "1234567"),
				new UserEntity(2L, "Petras", "Jonaitis", "222", "p@test.lt", "1234568"));
	}
}
