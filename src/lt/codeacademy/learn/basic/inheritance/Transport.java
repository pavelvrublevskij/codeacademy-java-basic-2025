package lt.codeacademy.learn.basic.inheritance;

// Super class
public class Transport extends Object {

	private final int wheelCount;
	private final String color;
	private final String model;

	public Transport(final int wheelCount, final String color, final String model) {
		this.wheelCount = wheelCount;
		this.color = color;
		this.model = model;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return String.format("%d-%s-%s",
				this.getWheelCount(),
				this.getColor(),
				this.getModel());
	}
}
