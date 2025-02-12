package lt.codeacademy.learn.basic.abstraction;

public class Cat extends AbstractAnimal {

	@Override
	public void voice() {
		System.out.println("Miau!");
	}

	@Override
	public void setCode() {
		super.code = "CAT_CODE";
	}
}
