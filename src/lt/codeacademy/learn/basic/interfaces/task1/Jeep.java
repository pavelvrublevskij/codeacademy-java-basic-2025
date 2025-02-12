package lt.codeacademy.learn.basic.interfaces.task1;

public class Jeep implements IsLandVehicle {
	public void soundHorn() {};

	@Override
	public int getNumWheels() {
		return 0;
	}

	@Override
	public void drive() {
		System.out.println("Vaziuoja!");
	}

	@Override
	public String getName() {
		return "";
	}

	@Override
	public int getMaxPassengers() {
		return 0;
	}

	@Override
	public void setMaxPassengers(final int maxPassengers) {

	}

	@Override
	public int getMaxSpeed() {
		return 0;
	}

	@Override
	public void setMaxSpeed(final int maxSpeed) {

	}
}
