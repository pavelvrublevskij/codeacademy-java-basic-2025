package lt.codeacademy.ca2025.task.task2;

public abstract class Lapuotis extends Medis {

	private static final String TURI_LAPUS_FORMAT = "%s turi lapus.";

	public Lapuotis() {
	}

	public Lapuotis(final String name) {
		super(name);
	}

	public String turi() {
		return String.format(TURI_LAPUS_FORMAT, name);
	};
}
