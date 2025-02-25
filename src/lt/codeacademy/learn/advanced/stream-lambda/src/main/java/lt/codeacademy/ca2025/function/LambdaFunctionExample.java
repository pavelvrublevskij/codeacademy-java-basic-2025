package lt.codeacademy.ca2025.function;

import java.util.function.IntBinaryOperator;

public class LambdaFunctionExample {

	public void run() {
		/*System.out.println("suma x ir y: " + new IntTotal() {

			@Override
			public int calc(final int a, final int b) {
				return a + b;
			}
		}.calc(2, 3));*/

		final IntTotal myFirstLambdaFunction = (a, b) -> a + b;
		final IntTotal mySecondLambdaFuntion = Integer::sum;
		final IntBinaryOperator usingJavaFunction = (a, b) -> (a + b) * 2;

		System.out.println("suma x ir y: " + myFirstLambdaFunction.calc(2, 3));
		System.out.println("suma x ir y: " + mySecondLambdaFuntion.calc(6, 3));
		System.out.println("suma x ir y: " + usingJavaFunction.applyAsInt(6, 3));

		System.out.println("skirtumas x ir y: " + ((IntTotal) (a, b) -> a - b).calc(5, 7));
	}
}
