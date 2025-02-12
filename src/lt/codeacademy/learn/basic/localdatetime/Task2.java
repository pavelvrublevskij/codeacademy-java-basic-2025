package lt.codeacademy.learn.basic.localdatetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import lt.codeacademy.learn.basic.util.ConsolePrinterUtil;

public class Task2 {

	public void run() {
		final Scanner scanner = new Scanner(System.in);
		String time;

		boolean isTimeCorrect = false;
		do {
			ConsolePrinterUtil.print("Iveskite laika (HH:mm):");
			time = scanner.next();
			if (time.length() > 5 || time.charAt(2) != ':') {
				ConsolePrinterUtil.print("Laikas turi buti su HH:mm formatu!");
				continue;
			}
			if (time.substring(0, 2).compareTo("23") > 0) {
				ConsolePrinterUtil.print("Valanda ivesta neteisingai!");
				continue;
			}
			if (time.substring(3, 5).compareTo("59") > 0) {
				ConsolePrinterUtil.print("Laikas ivestas neteisingai!");
				continue;
			}

			isTimeCorrect = true;
		} while (!isTimeCorrect);

		final LocalTime locaTime = LocalTime.parse(time, DateTimeFormatter.ISO_TIME);
		final LocalTime newLocaTime = locaTime.plusHours(2).plusMinutes(15);
		ConsolePrinterUtil.printFormat("Naujas laikas yra: %s\n", newLocaTime.toString());

		if (locaTime.isBefore(newLocaTime)) {
			ConsolePrinterUtil.print("Ivestas laikas yra pries nauja laika!");
		} else {
			ConsolePrinterUtil.print("Naujas laikas yra pries ivesta laika!");
		}

		scanner.close();
	}
}
