package lt.codeacademy.ca2025.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamTest3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "grapes");

		List<String> uppercaseWords = words.stream()
				.map(word -> word.toUpperCase())
//				.map(String::toLowerCase)
//				.map(word -> word.replace("a", "A"))
//				.filter(word -> word.length() > 4)
//				.map(word -> word + "!")
				.toList();

		System.out.println("Uppercase words: " + uppercaseWords);
	}
}
