package lt.codeacademy.learn.basic.interfaces.sample;

public class Circle implements Figure {

	private final double radius;

	public Circle(final double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * (2 * radius);
	}
}
