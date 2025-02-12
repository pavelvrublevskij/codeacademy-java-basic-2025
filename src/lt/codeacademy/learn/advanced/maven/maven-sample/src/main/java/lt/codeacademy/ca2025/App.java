package lt.codeacademy.ca2025;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        LOGGER.info("This is an info level log message!");
    }

}
