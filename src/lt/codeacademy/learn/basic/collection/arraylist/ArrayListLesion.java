package lt.codeacademy.learn.basic.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListLesion {

	public void task3Coordinates() {
		ArrayList<Koordinate> sarasas = new ArrayList<>();
		sarasas.add(new Koordinate(2, 5));
		sarasas.add(new Koordinate(1, 1));
		sarasas.add(new Koordinate(5, 0));
		sarasas.add(new Koordinate(0, 0));
		sarasas.add(new Koordinate(0, 5));
		sarasas.add(new Koordinate(2, 9));
		sarasas.add(new Koordinate(2, 2));

		printList(sarasas);

		for (Koordinate k: sarasas) {
			if (k.getX() == 0 && k.getY() == 0) {
				System.out.println(sarasas.indexOf(k) + 1);

				// pakeiciam is 0;0 -> 1;1
				k.setX(1);
				k.setY(1);

				break;
			}
		}

		printList(sarasas);
	}

	private void printList(final ArrayList<Koordinate> sarasas) {
		for (Koordinate k: sarasas) {
			System.out.printf("(%d; %d)\n", k.getX(), k.getY());
		}
	}

	public void task3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("d");
		list.add("a");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		// gaunam pasikartojancius
		ArrayList<String> repeatedWords = new ArrayList<>();
		int startCounter = 1;
		for (String elem: list) {
			for (int i = startCounter; i < list.size(); i++) {
				if (elem.equals(list.get(i)) && !repeatedWords.contains(elem)) {
					repeatedWords.add(elem);
				}
			}
			startCounter++;
		}
		System.out.println("Pasikartojantis: " + repeatedWords);

		// istrinam tuos kas yra kitam sarase
		list.removeAll(repeatedWords);
		System.out.println(list);
	}

	public void task1() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		while(true) {
			words.add(sc.next());
			System.out.println(words);

			if (words.size() == 5) {
				words.clear();
			}
		}
	}

	public void arrayListExamples() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Pirmas");
		list.add("Antras");
		list.add("Trecias");
		list.add("Ketvirtas");
		list.add("Penktas");
		System.out.println(list);

		list.set(2, "******");
		System.out.println(list);

		System.out.println("Pozicija teksto: " + list.indexOf("Antras"));
		System.out.println(list.get(3));
		System.out.println(list.getLast());
		System.out.println("saraso elementu kiekis: " + list.size());
		System.out.println(list.contains("Antras"));

		list.clear(); // isvalo sarasa

		list.add("Naujas Pirmas");
		System.out.println(list);

		list.set(0, "Labas vakaras");
		System.out.println(list);

		list.add(0, "Nauja pradzia");
		System.out.println(list);

		if (list.isEmpty()) {
			System.out.println("Mano sarasas tuscias!");
		} else {
			System.out.println("Sarasas ne tuscias");
		}

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");

		ArrayList<String> list3 = new ArrayList<>();
		list3.add("b");
		list3.add("c");

		list2.addAll(list3);
		System.out.println(list2);


		for (String element: list2) {
			int i = list2.indexOf(element);
			System.out.println(i + " : " + element);
		}

		// darbas su skaiciais
		// int -> Integer
		// float -> Float
		// double -> Double
		// boolean -> Boolean
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(2);
		integers.add(4);
		int suma = 0;
		for (int sk: integers) {
			suma += sk;
		}

		System.out.println(Math.abs(suma) / integers.size());
	}

	public void linkedListTask6() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		final int LIST_SIZE = 100000;
		long millis = 0L;

		Random random = new Random();
		for (int i = 0; i < LIST_SIZE; i++) {
			int sk = random.nextInt(100);
			linkedList.addLast(sk);
			arrayList.addLast(sk);
		}

		millis = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int index = random.nextInt(LIST_SIZE);
			linkedList.add(index, random.nextInt(100));
			linkedList.remove(index);
		}
		System.out.println("LinkedList time: " + (System.currentTimeMillis() - millis));

		millis = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int index = random.nextInt(LIST_SIZE);
			arrayList.add(index, random.nextInt(100));
			arrayList.remove(index);
		}
		System.out.println("ArrayList time: " + (System.currentTimeMillis() - millis));

		// atspausdinimo greitis
		millis = System.currentTimeMillis();
		for (int i = 0; i < LIST_SIZE; i++) {
			linkedList.get(i);
		}
		System.out.println("LinkedList Get time: " + (System.currentTimeMillis() - millis));

		// atspausdinimo greitis
		millis = System.currentTimeMillis();
		for (int i = 0; i < LIST_SIZE; i++) {
			arrayList.get(i);
		}
		System.out.println("ArrayList Get time: " + (System.currentTimeMillis() - millis));

		millis = System.currentTimeMillis();
		for (int i = 0; i < LIST_SIZE; i++) {
			linkedList.poll();
		}
		System.out.println("LinkedList Poll time: " + (System.currentTimeMillis() - millis));

		// atspausdinimo greitis
		millis = System.currentTimeMillis();
		for (int i = 0; i < LIST_SIZE / 2; i++) {
			arrayList.get(i);
			arrayList.remove(i);
		}
		System.out.println("ArrayList Get Remove time: " + (System.currentTimeMillis() - millis));
	}

	public void classExamples() {
		Card c1 = new Card("111");
		Card c2 = new Card("111");

		System.out.println(c1.getPin().equals(c2.getPin()));

		Card[] cards = {c1, c2}; //2
		System.out.println(cards[0].getPin().equals(cards[1].getPin()));
	}
}
