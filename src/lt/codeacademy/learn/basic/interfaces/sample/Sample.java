package lt.codeacademy.learn.basic.interfaces.sample;

import java.util.Random;

public class Sample {

	public void doIt() {
		Random r = new Random();
		final double circleRadius = r.nextDouble() * 100;
		final double squareSide = r.nextDouble() * 100;

		Figure circle = new Circle(circleRadius);
		Figure square = new Square(squareSide);

		System.out.println("Apskritimas " + circleRadius);
		System.out.printf("Plotas: %.2f\n", circle.getArea());
		System.out.printf("Perimetras: %.2f\n", circle.getPerimeter());

		if (square instanceof Square) {
			Square s = (Square) square;
			if (s instanceof IsCorneredFigure) {
				System.out.println("yra kampine figura!");
			}
		}
		System.out.println("Kvadratas " + squareSide);
		System.out.printf("Plotas: %.2f\n", square.getArea());
		System.out.printf("Perimetras: %.2f\n", square.getPerimeter());
	}
}
