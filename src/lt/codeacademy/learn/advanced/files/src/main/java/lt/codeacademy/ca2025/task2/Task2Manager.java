package lt.codeacademy.ca2025.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import lt.codeacademy.ca2025.task2.model.Driver;
import lt.codeacademy.ca2025.task2.service.DriverCSVOperationService;

public class Task2Manager {

	public final static Path FILE_PATH = Path.of(System.getProperty("user.home"), "ca2025", "task2.csv");

	private final DriverCSVOperationService driverCSVOperationService;

	public Task2Manager(final DriverCSVOperationService driverCSVOperationService) {
		this.driverCSVOperationService = driverCSVOperationService;
	}

	private final List<Driver> drivers = List.of(
			new Driver("Pavel Vrublevskij", "BMW", "ABC-123", 100_000),
			new Driver("Tomas Vrublevskij", "Audi", "DEF-456", 200_000),
			new Driver("Jonas Jonaitis", "VW", "GHI-789", 300_000),
			new Driver("Petras Petraitis", "Toyota", "JKL-012", 400_000),
			new Driver("Antanas Antanaitis", "Mazda", "MNO-345", 500_000)
	                                            );

	public void run() {
		try {
			Files.createDirectories(FILE_PATH.getParent());
			Files.writeString(FILE_PATH, "", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			driverCSVOperationService.saveToCsvDrivers(drivers);
			System.out.println("File saved at: " + FILE_PATH);

			List<Driver> drivers = driverCSVOperationService.readDriversFromCsv(FILE_PATH);

			for (Driver driver : drivers) {
				System.out.printf("Automobilis %s, vairuotojas %s, valstybinis numeris %s, rida %d\n", driver.getCar(), driver.getName(), driver.getLicensePlate(), driver.getMileage());
			}
		} catch (IOException e) {
			System.out.println("Error while saving file: " + e.getMessage());
		}
	}

}

