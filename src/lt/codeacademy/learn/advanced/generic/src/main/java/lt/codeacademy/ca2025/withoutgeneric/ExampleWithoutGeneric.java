package lt.codeacademy.ca2025.withoutgeneric;

public class ExampleWithoutGeneric {

	public void run() {
		Integer number;
		Box box = new Box();

		box.setObject(10);
		number = (Integer) box.getObject();

		box.setObject("Java");
		number = (Integer) box.getObject();
	}
}
