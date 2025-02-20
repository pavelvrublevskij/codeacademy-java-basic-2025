package lt.codeacademy.ca2025.task2;

import java.util.List;
import lt.codeacademy.ca2025.task2.model.Driver;
import lt.codeacademy.ca2025.task2.service.DriverOperatorService;

public class Task2Manager {

	private final DriverOperatorService driverOperatorService;

	public Task2Manager(final DriverOperatorService driverOperatorService) {
		this.driverOperatorService = driverOperatorService;
	}

	private final List<Driver> drivers = List.of(
			new Driver("Pavel Vrublevskij", "BMW", "ABC-123", 100_000),
			new Driver("Tomas Vrublevskij", "Audi", "DEF-456", 200_000),
			new Driver("Jonas Jonaitis", "VW", "GHI-789", 300_000),
			new Driver("Petras Petraitis", "Toyota", "JKL-012", 400_000),
			new Driver("Antanas Antanaitis", "Mazda", "MNO-345", 500_000)
	                                            );

	public void run() {
		driverOperatorService.operate(drivers);
	}

}

