package lt.codeacademy.learn.basic.classandmethods.task2;

import lt.codeacademy.learn.basic.util.ConsolePrinterUtil;

// data class
public class Person {
	private static final String TEXT = "Aš, %s %s, tikrai išmoksiu programuoti %s kalba";

	private String name;
	private String surname;
	private String programmingLanguage;
	private int learningWeekCount;

	public Person() {
//		System.out.println("cia default konstruktorius!");
	}

	public Person(String name) {
		this();
		this.name = name;
	}

	public Person(String name, String surname, String programmingLanguage, int learningWeekCount) {
		this(name);
		this.surname = surname;
		this.programmingLanguage = programmingLanguage;
		this.learningWeekCount = learningWeekCount;
	}

	public void printWithWeekInfo() {
		ConsolePrinterUtil.printFormat(TEXT + " per %d savaites.\n",
				name, surname, programmingLanguage, learningWeekCount);
	}

	public void print() {
		ConsolePrinterUtil.printFormat(TEXT + ".\n",
				name, surname, programmingLanguage);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(final String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public int getLearningWeekCount() {
		return learningWeekCount;
	}

	public void setLearningWeekCount(final int learningWeekCount) {
		this.learningWeekCount = learningWeekCount;
	}
}
