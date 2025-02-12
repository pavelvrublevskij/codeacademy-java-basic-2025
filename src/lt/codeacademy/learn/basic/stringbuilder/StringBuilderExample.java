package lt.codeacademy.learn.basic.stringbuilder;

public class StringBuilderExample {

	public void run() {
		String a = "a" + "b";

		String test = "test";  //test
		test += "222";  //test222

		StringBuilder sb = new StringBuilder("test");
		sb.append("222");

	}
}
