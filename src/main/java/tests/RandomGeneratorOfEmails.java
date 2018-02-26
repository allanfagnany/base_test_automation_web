package tests;

import org.junit.Test;
import java.util.UUID;


public class RandomGeneratorOfEmails {

    static String randomEmail = randomEmail();

    @Test
    private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }
}
