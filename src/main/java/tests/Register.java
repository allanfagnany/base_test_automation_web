package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static tests.Login.stringPassword;
import static tests.OrderPresenter.TIME_OUTLN_SECONDS;
import static tests.OrderPresenter.navegador;

public class Register {

    static String stringUserName = "Allan";
    static String stringLastName = "Fagnane";

    @Test
    public static void testRegister() {

        Initialize.testSetUp();

        WebDriverWait userName = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        userName.until(ExpectedConditions.elementToBeClickable(By.cssSelector(""))).sendKeys(stringUserName);

        WebDriverWait userLastName = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        userLastName.until(ExpectedConditions.elementToBeClickable(By.cssSelector(""))).sendKeys(stringLastName);

        WebDriverWait userEmail = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        userEmail.until(ExpectedConditions.elementToBeClickable(By.cssSelector(""))).sendKeys(Keys.CONTROL,Keys.ALT, "v");

        WebDriverWait userPassword = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        userPassword.until(ExpectedConditions.elementToBeClickable(By.cssSelector(""))).sendKeys(stringPassword);

        WebDriverWait userConfirmPassword = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        userConfirmPassword.until(ExpectedConditions.elementToBeClickable(By.cssSelector(""))).sendKeys(stringPassword);

        navegador.findElement(By.cssSelector("")).submit();

        navegador.close();
    }
}
