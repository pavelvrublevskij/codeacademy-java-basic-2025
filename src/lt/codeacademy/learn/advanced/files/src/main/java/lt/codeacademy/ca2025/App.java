package lt.codeacademy.ca2025;

import lt.codeacademy.ca2025.task2.Task2Manager;
import lt.codeacademy.ca2025.task2.service.DriverCSVOperationService;
import lt.codeacademy.ca2025.task2.service.DriverObjectFileOperationService;
import lt.codeacademy.ca2025.task2.transformer.DriverCSVTransformer;

public class App {
	public static void main(String[] args) {
		new Task2Manager(new DriverObjectFileOperationService()).run();
//		new Task2Manager(new DriverCSVOperationService(new DriverCSVTransformer())).run();
	}
}
