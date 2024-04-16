package test;

import Homework.ContactListRegisterationPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListLogInPage;

import java.time.Duration;

public class RegisterationTest {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

        ContactListRegisterationPage registerationPage  = new ContactListRegisterationPage(driver);
        registerationPage
                .firstnameById("sara ")
                .enterLastname("Ahmad")
                .enteremaileById("sara321Ahmad1232@gmail.com")
                .enterTelephoneyId("0556537812")
                .enterPasswordById("sara321")
                .enterPasswordConfirmaton("sara321")
                //.clickPrivacyPolicy()
                .clicksubmitbutton();
    }

    }
