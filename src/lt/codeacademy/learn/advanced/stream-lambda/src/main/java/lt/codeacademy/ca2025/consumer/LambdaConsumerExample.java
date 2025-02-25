package lt.codeacademy.ca2025.consumer;

import java.util.function.Consumer;
import lt.codeacademy.ca2025.model.Person;
import lt.codeacademy.ca2025.service.RCAddressRetrieverService;

public class LambdaConsumerExample {

	private final RCAddressRetrieverService addressRetrieverService;

	public LambdaConsumerExample(final RCAddressRetrieverService addressRetrieverService) {
		this.addressRetrieverService = addressRetrieverService;
	}

	public void demo() {
		final Person person = new Person("Petras", "Petraitis", "002");

		final Consumer<Person> personEnricher = (Person p) -> {
			p.setAddress(addressRetrieverService.getAddress(person));
			p.setPhone("0022222");
		};
		personEnricher.accept(person);
		System.out.println(person);
	}
}
