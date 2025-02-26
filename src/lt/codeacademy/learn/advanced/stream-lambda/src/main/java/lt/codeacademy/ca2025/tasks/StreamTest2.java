package lt.codeacademy.ca2025.tasks;

import java.util.Arrays;
import java.util.List;

public class StreamTest2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		int result = numbers.stream().mapToInt(integer -> integer.intValue()).sum();

		int result2 = numbers.stream().reduce(0, (t, u) -> t + u);
	}
}
