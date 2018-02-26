package tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class OrderPresenter {
    public static WebDriver navegador;
    static final int TIME_OUTLN_SECONDS = 35;

    @Before
    public static void setUp() {
        Initialize.testSetUp();
    }

    @Test
    public void generatorEmail() {
        RandomGeneratorOfEmails.generatorEmail();
    }

    @Test
    public void userRegister (){
        Register.testRegister();
    }

    @Test
    public void userLogin (){
        Login.testLogin();
    }
}
