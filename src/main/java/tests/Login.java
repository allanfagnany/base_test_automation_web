package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static tests.OrderPresenter.TIME_OUTLN_SECONDS;
import static tests.OrderPresenter.navegador;

public class Login {

    static String stringEmail = "allan@jera.com.br";
    static String stringPassword = "password";

    @Test
    public static void testLogin() {

        Initialize.testSetUp();

        WebDriverWait userEmail = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        userEmail.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#provider_email"))).sendKeys(stringEmail);

        WebDriverWait userPassword = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        userPassword.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#provider_password"))).sendKeys(stringPassword);

        navegador.findElement(By.cssSelector("")).submit();

        navegador.close();

    }
}
