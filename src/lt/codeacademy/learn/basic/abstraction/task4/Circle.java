package lt.codeacademy.learn.basic.abstraction.task4;

public class Circle extends Figure {

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
