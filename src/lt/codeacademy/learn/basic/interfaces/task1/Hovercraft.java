package lt.codeacademy.learn.basic.interfaces.task1;

public class Hovercraft implements IsLandVehicle, IsSeaVessel {
	public void enterLand() {};
	public void enterSea() {};

	@Override
	public int getNumWheels() {
		return 0;
	}

	@Override
	public void drive() {
		System.out.println("Vaziuoja!");
	}

	@Override
	public int getDisplacement() {
		return 0;
	}

	@Override
	public void launch() {

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
