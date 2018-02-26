package tests;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import static tests.OrderPresenter.navegador;


public class Initialize {

    static String stringUrl = "https://url";

    @Before
    public static void testSetUp() {
        System.setProperty("webdriver.chrome.driver","/home/alfa/drivers/chromedriver");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get(stringUrl);
    }
}
