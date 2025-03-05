package lt.codeacademy.ca2025.task.task2;

public abstract class Spygliuotis extends Medis {

	private static final String TURI_SPYGLIUS_FORMAT = "%s turi spyglius.";

	public Spygliuotis() {
	}

	public Spygliuotis(final String name) {
		super(name);
	}

	public String turi() {
		return String.format(TURI_SPYGLIUS_FORMAT, name);
	};
}
