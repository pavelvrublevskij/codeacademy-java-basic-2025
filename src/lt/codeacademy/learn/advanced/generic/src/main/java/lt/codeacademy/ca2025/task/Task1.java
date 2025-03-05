package lt.codeacademy.ca2025.task;

import java.util.List;

public class Task1 {

	public void run() {
		Integer[] digits = {1, 2, 3};
		String[] words = {"Hello", "World"};

		this.printArray(digits);
		this.printArray(words);
	}

	private <T> void printArray(final T[] a) {
		List.of(a).forEach(System.out::print);
	}

}
