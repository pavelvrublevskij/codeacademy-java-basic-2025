package lt.codeacademy.learn.basic.polymorphism.task1;

import java.util.Arrays;

public abstract class SkaiciusAbstract {

	protected static final int MAX_VALUE = 1000;
	public static final int MIN = 20;
	public static final int MAX = 200;
	public static final int RANDOM_VALUE = (int) (Math.floor(Math.random() * (MAX - MIN + 1)) + MIN);

	protected int[] skaiciai = new int[RANDOM_VALUE];

	public abstract void generuok();

	public int suma() {
		int suma = 0;
		for (int sk: skaiciai) {
			suma += sk;
		}

		return suma;
	}

	public String printSkaiciai() {
		return Arrays.toString(skaiciai);
	}
}
