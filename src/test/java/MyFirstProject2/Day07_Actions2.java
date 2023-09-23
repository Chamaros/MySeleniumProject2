package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day07_Actions2 extends TestBase {

    @Test
    public void hoverOverTest(){
   //     Given user is on the https://www.amazon.com/
   driver.get("https://www.amazon.com/");
   // when use click on "Account" link

WebElement accountspot = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
Actions actions = new Actions(driver);
actions.moveToElement(accountspot).perform();
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("karakas_hho@hotmail.com");
// Then verify the page title contains "Your Account"
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Amazon Sign-In"));

    }




}
