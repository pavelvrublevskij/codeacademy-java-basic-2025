package lt.codeacademy.ca2025;

import lt.codeacademy.ca2025.task2.Task2Manager;
import lt.codeacademy.ca2025.task2.transformer.DriverCSVTransformer;

public class App {
	public static void main(String[] args) {
		new Task2Manager(new DriverCSVTransformer()).run();
	}
}
