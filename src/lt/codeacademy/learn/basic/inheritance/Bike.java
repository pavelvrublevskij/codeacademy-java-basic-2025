package lt.codeacademy.learn.basic.inheritance;

// child class
public class Bike extends Transport {

	private boolean isSportBike;

	public Bike(final int wheelCount, final String color, final String model) {
		super(wheelCount, color, model);
	}

	public Bike(final int wheelCount, final String color, final String model, final boolean isSportBike) {
		this(wheelCount, color, model);
		this.isSportBike = isSportBike;
	}

	public boolean isSportBike() {
		return isSportBike;
	}

	public void setSportBike(final boolean sportBike) {
		isSportBike = sportBike;
	}

	@Override
	public String toString() {
		return super.toString()
				.concat(" is sport bike? ") + isSportBike();
	}

	@Override
	public boolean equals(final Object obj) {
		return this.getModel().equals(((Bike) obj).getModel());
	}
}
