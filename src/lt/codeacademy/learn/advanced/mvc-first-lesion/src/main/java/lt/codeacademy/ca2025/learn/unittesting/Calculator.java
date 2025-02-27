package lt.codeacademy.ca2025.learn.unittesting;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
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
}
