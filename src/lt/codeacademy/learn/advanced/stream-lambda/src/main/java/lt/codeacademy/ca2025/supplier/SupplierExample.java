package lt.codeacademy.ca2025.supplier;

import java.util.function.Supplier;
import lt.codeacademy.ca2025.model.Person;

public class SupplierExample {

	public void demo() {
		final Person person = new Person("Petras", "Petraitis", null);

		Supplier<String> personSupplier = () -> {
			person.setPhone("0002");

			return person.getPhone();
		};

		System.out.println("Person phone number: " + personSupplier.get());
	}
}
