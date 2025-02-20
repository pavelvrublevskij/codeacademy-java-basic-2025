package lt.codeacademy.ca2025.task2.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import lt.codeacademy.ca2025.task2.model.Driver;

public class DriverObjectFileOperationService implements DriverOperatorService {

	private final static Path FILE_PATH = Path.of(System.getProperty("user.home"), "ca2025", "task2.obj");

	public void operate(final List<Driver> drivers) {
		try {
			saveList(drivers);

			final List<Driver> driversFromFile = loadList();
			for (Driver driver : driversFromFile) {
				System.out.printf("Automobilis %s, vairuotojas %s, valstybinis numeris %s, rida %d\n", driver.getCar(), driver.getName(), driver.getLicensePlate(), driver.getMileage());
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error while saving file: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private <T> void saveList(List<T> list) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(FILE_PATH))) {
			out.writeObject(list);
			System.out.println("File saved at: " + FILE_PATH);
		}
	}

	private <T> List<T> loadList() throws IOException, ClassNotFoundException {
		if (Files.notExists(FILE_PATH)) return new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(FILE_PATH))) {
			return (List<T>) in.readObject();
		}
	}

	private <T> void appendToList(T item) throws IOException, ClassNotFoundException {
		List<T> list = loadList();
		list.add(item);
		saveList(list);
	}
}
