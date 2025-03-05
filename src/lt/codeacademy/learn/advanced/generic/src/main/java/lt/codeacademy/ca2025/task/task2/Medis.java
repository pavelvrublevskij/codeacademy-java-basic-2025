package lt.codeacademy.ca2025.task.task2;

public abstract class Medis {

	protected String name = this.getClass().getSimpleName();

	public Medis() {
	}

	public Medis(String name) {
		this.name = name;
	}


	abstract String turi();
}
