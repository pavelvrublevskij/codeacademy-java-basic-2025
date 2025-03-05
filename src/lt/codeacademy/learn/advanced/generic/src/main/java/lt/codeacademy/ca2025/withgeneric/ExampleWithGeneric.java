package lt.codeacademy.ca2025.withgeneric;

public class ExampleWithGeneric {

	public void run() {
		Integer number;
		Box<Integer> boxOfInteger = new Box<>();

		boxOfInteger.set(10);
		number = boxOfInteger.get();

//		boxOfInteger.set("Java"); // Compilation error
	}
}
