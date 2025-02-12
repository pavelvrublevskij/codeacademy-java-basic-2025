package lt.codeacademy.learn.basic.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceLesion {

	private final List<Transport> transports = new ArrayList<>();

	public void learn() {
		Bike bike = new Bike(2, "M", "BMX");
		Car car = new Car(4, "B", "WW");

		bike.setSportBike(true);
		System.out.println(bike.isSportBike());

		System.out.println(car.getModel());
		System.out.println(car.getColor());

		// --------------------------------------------

		Transport bike2 = new Bike(3, "R", "ModelX", true);
		Transport car2 = new Car(4, "B", "BMW");

		saveTransportToList(bike2);
		saveTransportToList(car2);

//		printTransports();

		System.out.println(transports);

		bike2.equals(bike);
	}

	private void saveTransportToList(final Transport transport) {
		transports.add(transport);
	}

//	private void printTransports() {
//		for (Transport t: transports) {
//			if (t instanceof Bike) {
//				Bike bike = (Bike) t;  // cast operation from Transport to Bike
//				System.out.println(bike.getModel() + " is sport bike? " + bike.isSportBike());
//			} else {
//				System.out.println(t.getModel());
//			}
//		}
//	}
}
