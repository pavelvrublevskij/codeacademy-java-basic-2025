package lt.codeacademy.ca2025;

import lt.codeacademy.ca2025.keyboard.GamingKeyboard;
import lt.codeacademy.ca2025.keyboard.Keyboard;
import lt.codeacademy.ca2025.keyboard.StandardKeyboard;

public class WindowsXPMachine {

	private final Keyboard keyboard;

	public WindowsXPMachine(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public void print() {
		System.out.println("Windows XP machine is ready to use with " + keyboard);
	}
}
