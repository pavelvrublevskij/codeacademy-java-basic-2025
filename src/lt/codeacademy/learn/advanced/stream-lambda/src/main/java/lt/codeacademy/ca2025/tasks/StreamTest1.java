package lt.codeacademy.ca2025.tasks;

import java.util.Arrays;

public class StreamTest1 {

	public static void main(String[] args) {
		Arrays.asList("apple", "banana", "orange", "kiwi", "grapes").stream()
				.filter((word) -> word.length() > 5)
				.forEach(x -> System.out.println(x));
	}
}
