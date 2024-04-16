package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListRegisterationPage {

    WebDriver ldriver;
    By firstnameById = By.id("input-firstname");
    By lastnameById = By.id("input-lastname");
    By emaileById = By.id("input-email");
    By TelephoneyId = By.id("input-telephone");
    By PasswordById = By.id("input-password");
    By PasswordConfirmaton = By.id("input-confirm");
    By submitbutton = By.xpath("//*[@class='btn btn-primary']");
    By checkbox = By.xpath("//*[text()='I have read and agree to the ']");


    public ContactListRegisterationPage(WebDriver gdriver) {
        ldriver = gdriver;
    }

    public ContactListRegisterationPage firstnameById(String fname) {
        ldriver.findElement(firstnameById).sendKeys(fname);
        return this;
    }

    public ContactListRegisterationPage enterLastname(String lname) {
        ldriver.findElement(lastnameById).sendKeys(lname);
        return this;
    }

    public ContactListRegisterationPage enteremaileById(String email) {
        ldriver.findElement(emaileById).sendKeys(email);
        return this;
    }

    public ContactListRegisterationPage enterTelephoneyId(String telephone) {
        ldriver.findElement(TelephoneyId).sendKeys(telephone);
        return this;
    }

    public ContactListRegisterationPage enterPasswordById(String password) {
        ldriver.findElement(PasswordById).sendKeys(password);
        return this;
    }

    public ContactListRegisterationPage enterPasswordConfirmaton(String passconf) {
        ldriver.findElement(PasswordConfirmaton).sendKeys(passconf);
        return this;
    }

//    public ContactListRegisterationPage clickPrivacyPolicy() {
//        ldriver.findElement(checkbox).click();
//        return this;}

    public ContactListsuccessfullycreated clicksubmitbutton() {
        ldriver.findElement(checkbox).click();
        ldriver.findElement(submitbutton).click();
        return new ContactListsuccessfullycreated(ldriver);

        }












}
