package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day07_Authentication extends TestBase {

    @Test
    public void basicAuthTest(){
        // https://username:password@URL
        // username: admin
        // password : admin
        // URL: https://the-internet.herokuapp.com/basic_auth

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //THIS should let us log in

        // verify the login is succesfull
        String welcomeMessage= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        Assert.assertEquals("Congratulations! You must have the proper credentials.",welcomeMessage);
    }









}
