package lt.codeacademy.learn.basic.polymorphism.task1;

import java.util.Random;

public class TeigiamasSkaicius extends SkaiciusAbstract {

	@Override
	public void generuok() {
		final Random r = new Random();
		for (int i = 0; i < skaiciai.length; i++) {
			skaiciai[i] = r.nextInt(MAX_VALUE);
		}
	}
}
