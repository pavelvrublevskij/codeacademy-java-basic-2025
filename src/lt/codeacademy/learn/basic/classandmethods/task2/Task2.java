package lt.codeacademy.learn.basic.classandmethods.task2;

import java.util.Arrays;
import java.util.Scanner;
import lt.codeacademy.learn.basic.util.ConsolePrinterUtil;

public class Task2 {

	private Scanner scanner = new Scanner(System.in);
	private Person[] persons = new Person[3];

	public void run() {
		ConsolePrinterUtil.print("Iveskite asmens varda, pavarde, kalba ir savaites skaiciu:");

		Person obj1 = new Person();
		obj1.setName("Petras");
		obj1.setSurname("Petrauskas");
		obj1.setProgrammingLanguage("Java");
		obj1.setLearningWeekCount(14);
		persons[0] = obj1;

		Person obj2 = new Person("Onute", "Petrauske", "PHP", 1);
		persons[1] = obj2;

		Person obj3 = new Person("Antanas");
		obj3.setProgrammingLanguage("C#");
		obj3.setLearningWeekCount(10);
		persons[2] = obj3;

		// spausdinam visa informacija is masyvo
		getAllPersonsInfo();

		scanner.close();
	}

	private void getAllPersonsInfo() {
		for (Person person: persons) {
			if (person.getName().equals("Onute")) {
				person.print();
			} else {
				person.printWithWeekInfo();
			}
		}
	}
}
