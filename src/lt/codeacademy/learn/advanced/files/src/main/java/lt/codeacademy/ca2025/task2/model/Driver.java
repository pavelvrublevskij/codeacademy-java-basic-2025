package lt.codeacademy.ca2025.task2.model;

import java.io.Serializable;

public class Driver implements Serializable {

	private String name;
	private String car;
	private String licensePlate;
	private int mileage;

	public Driver() {
	}

	public Driver(final String name, final String car, final String licensePlate, final int mileage) {
		this.name = name;
		this.car = car;
		this.licensePlate = licensePlate;
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getCar() {
		return car;
	}

	public void setCar(final String car) {
		this.car = car;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(final String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(final int mileage) {
		this.mileage = mileage;
	}
}
