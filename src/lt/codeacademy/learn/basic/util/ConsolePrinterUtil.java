package lt.codeacademy.learn.basic.util;

/**
 * Klase atsakinga uz spausdinima i konsole.
 */
public class ConsolePrinterUtil {

	public static void print(String text) {
		System.out.println(text);
	}

	public static void printFormat(String formatText, Object... args) {
		System.out.printf(formatText, args);
	}
}
