package lt.codeacademy.learn.basic.interfaces.sample;

public class Square implements Figure, IsCorneredFigure {

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
