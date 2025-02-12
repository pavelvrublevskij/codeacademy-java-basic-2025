package lt.codeacademy.learn.basic.polymorphism;

import java.util.Scanner;
import lt.codeacademy.learn.basic.polymorphism.task1.LyginisSkaicius;
import lt.codeacademy.learn.basic.polymorphism.task1.NeigiamiSkaiciai;
import lt.codeacademy.learn.basic.polymorphism.task1.NelyginisSkaicius;
import lt.codeacademy.learn.basic.polymorphism.task1.SkaiciusAbstract;
import lt.codeacademy.learn.basic.polymorphism.task1.TeigiamasSkaicius;

public class Task1Sample {

	private static final String MENU = ""
			+ "1 - Teigiamas Skaicius\n"
			+ "2 - Neigiami Skaiciai\n"
			+ "3 - Nelyginis Skaicius\n"
			+ "4 - Lyginis Skaicius\n";

	public void doIt() {
		final Scanner sc = new Scanner(System.in);
		boolean breakLoop = false;
		while (!breakLoop) {
			System.out.println(MENU);
			switch (sc.nextInt()) {
			case 1 -> polymorphismMethodExample(new TeigiamasSkaicius());
			case 2 -> polymorphismMethodExample(new NeigiamiSkaiciai());
			case 3 -> polymorphismMethodExample(new NelyginisSkaicius());
			case 4 -> polymorphismMethodExample(new LyginisSkaicius());
			default -> breakLoop = true;
			}
		}
	}

	private void polymorphismMethodExample(final SkaiciusAbstract skaicius) {
		skaicius.generuok();
		System.out.println(skaicius.printSkaiciai());
		System.out.println(skaicius.suma());
	}
}
