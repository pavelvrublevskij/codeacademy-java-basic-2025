package lt.codeacademy.learn.basic.abstraction.task1;

import java.time.LocalDate;

public class Sunkvezimis {
	private static final String DATE_FORMAT = "yyyy-MM-dd";

	private final LocalDate registracijosData;
	private final int maksimalusKrovinioDydis;
	private final String spalva;

	public Sunkvezimis(final LocalDate registracijosData, final int bagazinesTalpa, final String spalva) {
		this.registracijosData = registracijosData;
		this.maksimalusKrovinioDydis = bagazinesTalpa;
		this.spalva = spalva;
	}

	public LocalDate getRegistracijosData() {
		return registracijosData;
	}

	public int getMaksimalusKrovinioDydis() {
		return maksimalusKrovinioDydis;
	}

	public String getSpalva() {
		return spalva;
	}

	public void vaziuoti() {

	}
}
