package lt.codeacademy.ca2025.learn.unittesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@Test
	void testSumShouldReturnValidZeroResult() {
		// given
		calculator.setA(0);
		calculator.setB(0);

		// when
		final int sum = calculator.sum();

		// then
		assertEquals(0, sum);
	}

	@Test
	void testSumShouldReturnValidOneResult() {
		calculator.setA(0);
		calculator.setB(1);
		assertEquals(1, calculator.sum());

		calculator.setA(1);
		calculator.setB(0);
		assertEquals(1, calculator.sum());
	}

	@Test
	void testSumShouldReturnValidResults() {
		assertEquals(5, new Calculator(2, 3).sum());
		assertEquals(20, new Calculator(10, 10).sum());
		assertEquals(-20, new Calculator(10, -30).sum());
	}

	@Test
	void testDivideByZeroReturnException() {
		calculator.setA(1);
		calculator.setB(0);
		assertThrows(ArithmeticException.class, calculator::divide);
	}

	@Test
	void testExceptionMessage() {
		Exception exception = assertThrows(ArithmeticException.class, calculator::divide);
		assertEquals("Division by zero is not allowed", exception.getMessage());
	}
}
