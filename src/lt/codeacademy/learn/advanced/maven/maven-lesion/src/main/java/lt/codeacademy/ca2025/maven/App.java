package lt.codeacademy.ca2025.maven;

import lt.pavel.maven.session.MyMath;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        MyMath myMath = new MyMath();
        System.out.println(myMath.add(1, 2));
    }
}
