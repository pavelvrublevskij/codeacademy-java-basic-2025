package lt.codeacademy.learn.basic.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLesion {

	public void task1() {
		final HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Vienas");
		map.put(3, "Trys");
		map.put(11, "Vienuolika");
		map.put(4, "Keturi");
		map.put(2, "Du");
		map.put(4, "Penki");
		map.put(100, "Simtas");

		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());

		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("Simtas"));

		System.out.println(map.get(3));

		spausdintiMap(map);
		map.remove(11);
		spausdintiMap(map);
		map.clear();
		spausdintiMap(map);
	}

	public void task4() {
		final Studentas st1 = new Studentas("Petras", "Petraitis", "VU");
		final Studentas st2 = new Studentas("Ona", "Onute", "VGTU");

		final HashMap<Integer, Studentas> studentai = new HashMap<>();
		studentai.put(1112, st1);
		studentai.put(1122, st2);
		studentai.put(1133, null);

		Scanner sc = new Scanner(System.in);
		int studentoNr = sc.nextInt();
		if (studentai.containsKey(studentoNr)) {
			Studentas studentas = studentai.get(studentoNr);
			if (studentas != null) {  // null check operation
				System.out.println("Rastas studentas: " + studentas.getPilnasVardas());
			} else {
				// pranesti kad klaida
				// pasiulyti ivesti nauja studenta ir priskirti tam raktui
			}
		} else {
			System.out.println("Studentas pagal ivesta rakta nerastas!");
		}
	}

	private void spausdintiMap(final HashMap<Integer, String> map) {
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
