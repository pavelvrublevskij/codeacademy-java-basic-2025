package lt.codeacademy.learn.basic.collection.map;

public class Studentas {
	private final String vardas;
	private final String pavarde;
	private final String universitetas;

	public Studentas(final String vardas, final String pavarde, final String universitetas) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.universitetas = universitetas;
	}

	public String getVardas() {
		return vardas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public String getUniversitetas() {
		return universitetas;
	}

	public String getPilnasVardas() {
		return vardas + " " + pavarde;
	}
}
