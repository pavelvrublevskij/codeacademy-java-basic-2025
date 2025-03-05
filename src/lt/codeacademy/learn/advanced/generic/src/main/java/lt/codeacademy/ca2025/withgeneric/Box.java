package lt.codeacademy.ca2025.withgeneric;

public class Box<T> {
	private T type;

	public Box() {
	}

	public Box(final T type) {
		this.type = type;
	}

	public T get() {
		return type;
	}

	public void set(T type) {
		this.type = type;
	}
}
