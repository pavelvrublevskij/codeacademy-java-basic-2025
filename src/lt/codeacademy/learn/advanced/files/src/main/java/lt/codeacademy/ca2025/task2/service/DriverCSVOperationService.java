package lt.codeacademy.ca2025.task2.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import lt.codeacademy.ca2025.task2.model.Driver;
import lt.codeacademy.ca2025.task2.transformer.DriverCSVTransformer;

public class DriverCSVOperationService {

	private final static Path FILE_PATH = Path.of(System.getProperty("user.home"), "ca2025", "task2.csv");

	private final DriverCSVTransformer driverCSVTransformer;

	public DriverCSVOperationService(final DriverCSVTransformer driverCSVTransformer) {
		this.driverCSVTransformer = driverCSVTransformer;
	}

	public void operate(List<Driver> drivers) {
		try {
			Files.createDirectories(FILE_PATH.getParent());
			Files.writeString(FILE_PATH, "", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			saveToCsvDrivers(drivers);
			System.out.println("File saved at: " + FILE_PATH);

			for (Driver driver : readDriversFromCsv(FILE_PATH)) {
				System.out.printf("Automobilis %s, vairuotojas %s, valstybinis numeris %s, rida %d\n", driver.getCar(), driver.getName(), driver.getLicensePlate(), driver.getMileage());
			}
		} catch (IOException e) {
			System.out.println("Error while saving file: " + e.getMessage());
		}
	}

	private void saveToCsvDrivers(List<Driver> drivers) throws IOException {
		for (Driver driver : drivers) {
			final String contentToSave = driverCSVTransformer.toCSV(driver);
			Files.writeString(FILE_PATH, contentToSave, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		}
	}

	private List<Driver> readDriversFromCsv(final Path csvFilePath) throws IOException {
		final List<String> lines = Files.readAllLines(csvFilePath);
		final List<Driver> drivers = new ArrayList<>();
		for (String line : lines) {
			final String[] words = line.split(",");
			final Driver driver = new Driver();
			for (int i = 0; i < words.length; i++) {
				final String word = words[i];
				switch (i) {
					case 0 -> driver.setName(word);
					case 1 -> driver.setCar(word);
					case 2 -> driver.setLicensePlate(word);
					case 3 -> driver.setMileage(Integer.parseInt(word));
				}
			}
			drivers.add(driver);
		}

		return drivers;
	}
}
