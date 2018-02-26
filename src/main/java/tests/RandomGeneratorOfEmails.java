package tests;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static tests.OrderPresenter.TIME_OUTLN_SECONDS;
import static tests.OrderPresenter.navegador;

public class RandomGeneratorOfEmails {

    static String stringUrl = "https://www.mohmal.com/pt";

    @Before
    public static void generatorEmail() {
        System.setProperty("webdriver.chrome.driver", "/home/alfa/drivers/chromedriver");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get(stringUrl);

        WebDriverWait buttonGenerator = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        buttonGenerator.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#rand"))).click();

        WebDriverWait copyEmail = new WebDriverWait(navegador, TIME_OUTLN_SECONDS);
        copyEmail.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email > div.email"))).click();

        navegador.close();
    }
}
