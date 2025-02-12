package lt.codeacademy.learn.basic.staticfinal;

// immutable class
public class PersonCreditCardData {

	private static double creditCardMoneyValue;

	private final String fullName;
	private final String number;
	private final int cvc;
	private final double cardMoneyValue;

	public PersonCreditCardData(final String fullName, final String number, final int cvc, final double cardMoneyValue) {
		this.fullName = fullName;
		this.number = number;
		this.cvc = cvc;
		creditCardMoneyValue += cardMoneyValue;
		this.cardMoneyValue = creditCardMoneyValue;
	}

	public static double getStaticCreditCardMoneyValue() {
		return creditCardMoneyValue;
	}

	public String getFullName() {
		return fullName;
	}

	public String getNumber() {
		return number;
	}

	public int getCvc() {
		return cvc;
	}

	public double getCardMoneyValue() {
		return cardMoneyValue;
	}
}
