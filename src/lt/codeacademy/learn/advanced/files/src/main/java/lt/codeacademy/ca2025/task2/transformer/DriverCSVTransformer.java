package lt.codeacademy.ca2025.task2.transformer;

import lt.codeacademy.ca2025.task2.model.Driver;

public final class DriverCSVTransformer {

	private final static String DELIMITER = ",";
	private final static String NEW_LINE = "\n";

	public String toCSV(final Driver driver) {
		return driver.getName() + DELIMITER
				+ driver.getCar() + DELIMITER
				+ driver.getLicensePlate() + DELIMITER
				+ driver.getMileage() + NEW_LINE;
	}
}
