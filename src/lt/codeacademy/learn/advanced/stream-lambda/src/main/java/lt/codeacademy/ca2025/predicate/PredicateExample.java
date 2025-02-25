package lt.codeacademy.ca2025.predicate;

import java.util.function.Predicate;
import lt.codeacademy.ca2025.model.Person;

public class PredicateExample {

	public void demo() {
		final Person person = new Person("Petras", "Petraitis", null);

		Predicate<Person> hasPhoneNumber = (Person p) -> p.getPhone() != null;

		if (hasPhoneNumber
				.and(hasAddressPredicate())
				.test(person)) {
			System.out.println("Phone number and address available");
		} else {
			System.out.println("Phone number and address not available");
		}
	}

	private Predicate<Person> hasAddressPredicate() {
		return p -> p.getAddress() != null;
	}
}
