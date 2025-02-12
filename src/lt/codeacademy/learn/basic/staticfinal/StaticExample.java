package lt.codeacademy.learn.basic.staticfinal;

public class StaticExample {

	public void run() {
		PersonCreditCardData p1 = new PersonCreditCardData("A A", "12345", 111, 200.00);
		PersonCreditCardData p2 = new PersonCreditCardData("B B", "12366", 222, 100.00);
		PersonCreditCardData p3 = new PersonCreditCardData("C C", "12377", 333, 400.00);

		System.out.println("as kaip p1 objektas turiu pinigu: " + p1.getCardMoneyValue()); // 200
		System.out.println("as kaip p2 objektas turiu pinigu: " + p2.getCardMoneyValue()); // 100
		System.out.println("as kaip p3 objektas turiu pinigu: " + p3.getCardMoneyValue()); // 400
	}
}
