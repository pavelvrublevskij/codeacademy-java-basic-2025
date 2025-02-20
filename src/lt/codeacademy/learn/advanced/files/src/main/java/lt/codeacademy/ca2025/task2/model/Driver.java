package lt.codeacademy.ca2025.task2.model;

public class Driver {

	private final String name;
	private final String car;
	private final String licensePlate;
	private final int mileage;

	public Driver(final String name, final String car, final String licensePlate, final int mileage) {
		this.name = name;
		this.car = car;
		this.licensePlate = licensePlate;
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public String getCar() {
		return car;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public int getMileage() {
		return mileage;
	}
}
