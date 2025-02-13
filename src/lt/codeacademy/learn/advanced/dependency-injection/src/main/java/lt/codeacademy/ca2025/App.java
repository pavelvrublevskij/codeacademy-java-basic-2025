package lt.codeacademy.ca2025;

import lt.codeacademy.ca2025.keyboard.GamingKeyboard;
import lt.codeacademy.ca2025.keyboard.Keyboard;
import lt.codeacademy.ca2025.keyboard.StandardKeyboard;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Perku windows xp kompiuteri ir papildomai nusipirksiu gaming klaviatura");
		final int chosen = 1;
		Keyboard keyboard = (chosen == 1 ? new StandardKeyboard() : new GamingKeyboard());
		WindowsXPMachine wXpStandard = new WindowsXPMachine(keyboard);
		wXpStandard.print();
	}
}
