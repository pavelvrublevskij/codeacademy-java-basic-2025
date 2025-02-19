package lt.codeacademy.ca2025.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TextFileManager {

	private final static Path FILE_PATH = Path.of(System.getProperty("user.home"), "ca2025", "task1.txt");
	private final static Path FILE_2_PATH = Path.of(System.getProperty("user.home"), "ca2025", "task1_reverse.txt");

	public void run() {
		try {
			Files.createDirectories(FILE_PATH.getParent());
			final String contentToSave = "Pavel Vrublevskij";
			Files.writeString(FILE_PATH, contentToSave, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			System.out.println("File saved at: " + FILE_PATH);

			String contentFromFile = Files.readString(FILE_PATH);
			String reversedContent = new StringBuilder(contentFromFile).reverse().toString();
			Files.writeString(FILE_2_PATH, reversedContent, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

			System.out.println("File with reverse content saved at: " + FILE_2_PATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
