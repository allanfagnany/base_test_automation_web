package tests;

import org.junit.Before;
import java.util.UUID;



public class RandomGeneratorOfEmails {

    static String randomEmail = randomEmail();

    @Before
    public static void generatorEmail() {

    }

    private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }
}
