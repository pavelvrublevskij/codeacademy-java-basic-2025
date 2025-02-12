package lt.codeacademy.learn.basic.abstraction.task1;

import java.time.LocalDate;

public class Automobilis {
	private static final String DATE_FORMAT = "yyyy-MM-dd";

	private final LocalDate registracijosData;
	private final int bagazinesTalpa;
	private final String spalva;

	public Automobilis(final LocalDate registracijosData, final int bagazinesTalpa, final String spalva) {
		this.registracijosData = registracijosData;
		this.bagazinesTalpa = bagazinesTalpa;
		this.spalva = spalva;
	}

	public LocalDate getRegistracijosData() {
		return registracijosData;
	}

	public int getBagazinesTalpa() {
		return bagazinesTalpa;
	}

	public String getSpalva() {
		return spalva;
	}

	public void vaziuoti() {

	}
}
