package Homework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListsuccessfullycreated{

    WebDriver ldriver;

    By text= By.xpath("//*[text()='Your Account Has Been Created!']");

    public ContactListsuccessfullycreated(WebDriver gdriver){
        ldriver=gdriver;}

    public void verifiytext(){
       Assert.assertTrue(ldriver.findElement(text).isDisplayed());

    }





}
