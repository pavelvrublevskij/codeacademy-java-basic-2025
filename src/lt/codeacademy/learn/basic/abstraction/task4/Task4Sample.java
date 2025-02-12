package lt.codeacademy.learn.basic.abstraction.task4;

import java.util.Random;

public class Task4Sample {

	public void doIt() {
		Random r = new Random();
		final double circleRadius = r.nextDouble() * 100;
		final double squareSide = r.nextDouble() * 100;

		Figure circle = new Circle(circleRadius);
		Figure square = new Square(squareSide);

		System.out.println("Apskritimas " + circleRadius);
		System.out.printf("Plotas: %.2f\n", circle.getArea());
		System.out.printf("Perimetras: %.2f\n", circle.getPerimeter());

		System.out.println("Kvadratas " + squareSide);
		System.out.printf("Plotas: %.2f\n", square.getArea());
		System.out.printf("Perimetras: %.2f\n", square.getPerimeter());
	}
}
