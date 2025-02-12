package lt.codeacademy.learn.basic.abstraction.task4;

public class Square extends Figure {

	private final double a;

	public Square(final double a) {
		this.a = a;
	}

	@Override
	public double getArea() {
		return a * a;
	}

	@Override
	public double getPerimeter() {
		return 4 * a;
	}
}
