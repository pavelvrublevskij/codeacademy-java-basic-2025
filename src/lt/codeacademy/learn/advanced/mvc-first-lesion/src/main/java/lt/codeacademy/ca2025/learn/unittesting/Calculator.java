package lt.codeacademy.ca2025.learn.unittesting;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Calculator {

	private int a;
	private int b;

	public int sum() {
		return a + b;
	}

	public double divide() {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
	}
}
