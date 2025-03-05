package lt.codeacademy.ca2025.withgeneric;

public class ExampleWithGeneric {

	public void run() {
		Integer number;
		Box<Integer> boxOfInteger = new Box<>();

		boxOfInteger.set(10);
		number = boxOfInteger.get();

//		boxOfInteger.set("Java"); // Compilation error

		usePairInExample();
		useRawExample();
	}

	private void useRawExample() {
		Box box = new Box(); // Raw type
		box.set(10);
//		String text = (String) box.get();  // compilation error
	}

	private void usePairInExample() {
		Pair<Integer, String> pair = new PairImpl<>(1, "Pirmadienis");
		System.out.println(pair.getKey() + " " + pair.getValue());

		Pair<Integer, Integer> pair2 = new PairImpl<>(1, 2);
		Pair<Integer, Box<String>> pair3 = new PairImpl<>(1, new Box<>("Test"));

		System.out.println(pair3.getValue().get());
	}

	public void inheritanceExample(Box<? extends Number> numberBox) {
		///
	}

	private void test() {
		inheritanceExample(new Box<Number>());
	}

}
