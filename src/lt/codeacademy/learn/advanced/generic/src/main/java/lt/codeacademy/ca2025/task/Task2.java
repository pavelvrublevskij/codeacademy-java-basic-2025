package lt.codeacademy.ca2025.task;

import lt.codeacademy.ca2025.task.task2.Berzas;
import lt.codeacademy.ca2025.task.task2.Kadagys;

public class Task2 {

	public void run() {
		System.out.println(new Kadagys().turi());
		System.out.println(new Berzas().turi());
		System.out.println(new Berzas("Beržas").turi());
	}
}
