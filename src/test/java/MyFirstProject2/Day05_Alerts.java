package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;

public class Day05_Alerts extends TestBase {
    @Test
    public void acceptAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // accept alert => click on the first alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        // verify the text "I am  a JS ALERT" ,
        String alertText = driver.switchTo().alert().getText();
        System.out.println(driver.switchTo().alert().getText()); //string container yapmadan da oluyor
        System.out.println(alertText);
        Assert.assertEquals("you successfully clicked", "I am a JS Alert", alertText);
        // CLICK OK,

        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        // Verify "you successfully clicked an Alert"
        System.out.println(driver.findElement(By.id("result")).getText());
        Assert.assertEquals("You successfully clicked an alert", driver.findElement(By.id("result")).getText());
    }
    @Test
    public void dismissAlert() throws InterruptedException {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            // dismiss alert => click on the second alert
            driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
            // verify the text "I am  a JS Confirm" ,
            String dismissText =  driver.switchTo().alert().getText();
          //  System.out.println(driver.switchTo().alert().getText()); //string container yapmadan da oluyor
            System.out.println(dismissText);
            Assert.assertEquals("you successfully verified","I am a JS Confirm",dismissText);
            // CLICK OK,

            Thread.sleep(1500);
            driver.switchTo().alert().dismiss();
            // Verify "you successfully clicked an Alert"
            System.out.println(driver.findElement(By.id("result")).getText());
            Assert.assertEquals("You clicked: Cancel",driver.findElement(By.id("result")).getText());
        }
     @Test
    public void sendKeysAlert() throws InterruptedException {
         driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         // send keys alert => click on the third alert
         driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();


         //verify the text "I am a JS prompt" ,
         String Text =  driver.switchTo().alert().getText();
         //  System.out.println(driver.switchTo().alert().getText()); //string container yapmadan da oluyor
         System.out.println(Text);
         Assert.assertEquals("I am a JS prompt",Text);


         // write a text //sendkeys to this text alert
         driver.switchTo().alert().sendKeys("Hello World");
         Thread.sleep(3000);
         driver.switchTo().alert().accept();

         System.out.println(driver.findElement(By.id("result")).getText());
         Assert.assertEquals("You entered: Hello World",driver.findElement(By.id("result")).getText());
            Thread.sleep(2000);
         //eger yazi girmeyip hayir derse kismi. derste yok
         driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().dismiss();
         System.out.println(driver.findElement(By.id("result")).getText());
         Assert.assertEquals("You entered: null",driver.findElement(By.id("result")).getText());

     }






}
