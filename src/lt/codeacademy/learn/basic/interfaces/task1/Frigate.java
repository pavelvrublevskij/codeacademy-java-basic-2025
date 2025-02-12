package lt.codeacademy.learn.basic.interfaces.task1;

public class Frigate implements IsSeaVessel {
	public void fireGun() {};

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
