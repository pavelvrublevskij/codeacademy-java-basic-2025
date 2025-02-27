package lt.codeacademy.ca2025.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User Domain Tests")
class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User(
            "John",
            "Doe",
            "john.doe@example.com",
            "+37061234567"
        );
    }

    @Test
    @DisplayName("Should create user with all fields")
    void shouldCreateUserWithAllFields() {
        assertAll(
            () -> assertEquals("John", user.getName(), "Name should match"),
            () -> assertEquals("Doe", user.getSurname(), "Surname should match"),
            () -> assertEquals("john.doe@example.com", user.getEmailAddress(), "Email should match"),
            () -> assertEquals("+37061234567", user.getPhoneNumber(), "Phone number should match")
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"John", "Jane", "Bob"})
    @DisplayName("Should create user with different names")
    void shouldCreateUserWithDifferentNames(String name) {
        User testUser = new User(name, "Doe", "test@example.com", "+37061234567");
        assertEquals(name, testUser.getName(), "User name should match the provided value");
    }
} 