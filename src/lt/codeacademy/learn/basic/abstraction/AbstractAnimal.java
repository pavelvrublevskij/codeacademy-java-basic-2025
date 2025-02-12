package lt.codeacademy.learn.basic.abstraction;

public abstract class AbstractAnimal {

	protected String code;

	public abstract void voice();
	public abstract void setCode();

	@Override
	public String toString() {
		return "Cia yra gyvunas!";
	}
}
