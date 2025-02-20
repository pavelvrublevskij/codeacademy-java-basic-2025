package lt.codeacademy.ca2025.task2.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import lt.codeacademy.ca2025.task2.model.Driver;
import lt.codeacademy.ca2025.task2.transformer.DriverCSVTransformer;
import static lt.codeacademy.ca2025.task2.Task2Manager.FILE_PATH;

public class DriverCSVOperationService {

	private final DriverCSVTransformer driverCSVTransformer;

	public DriverCSVOperationService(final DriverCSVTransformer driverCSVTransformer) {
		this.driverCSVTransformer = driverCSVTransformer;
	}

	public void saveToCsvDrivers(List<Driver> drivers) throws IOException {
		for (Driver driver : drivers) {
			final String contentToSave = driverCSVTransformer.toCSV(driver);
			Files.writeString(FILE_PATH, contentToSave, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		}
	}

	public List<Driver> readDriversFromCsv(final Path csvFilePath) throws IOException {
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
