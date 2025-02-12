package lt.codeacademy.learn.basic.interfaces.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1Sample {

	private final List<IsVehicle> vehicles = new ArrayList<>();

	public void doIt() {
		vehicles.add(new Hovercraft());
		vehicles.add(new Jeep());
		vehicles.add(new Jeep());
		vehicles.add(new Jeep());
		vehicles.add(new Frigate());
		vehicles.add(new Jeep());

		for (IsVehicle vehicle: vehicles) {
			printVehicle(vehicle);
		}
	}

	private void printVehicle(final IsVehicle vehicle) {
		System.out.println(vehicle);

		if (vehicle instanceof IsLandVehicle landVehicle) {
			landVehicle.drive();
		}
	}

}
