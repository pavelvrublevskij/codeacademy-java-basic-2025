package lt.codeacademy.learn.basic.abstraction;

public class Dog extends AbstractAnimal {

	@Override
	public void voice() {
		System.out.println("Au!");
	}

	@Override
	public void setCode() {
		super.code = "DOG_CODE";
	}
}
