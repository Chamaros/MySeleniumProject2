package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day06_Iframe extends TestBase {

    @Test
    public void iframeTest(){
        driver.get("https://the-internet.herokuapp.com/iframe");

        //Verify the Bolded text contains "Editor"
           String pageHeader = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
        Assert.assertTrue(pageHeader.contains("Editor"));
        //Locate the Text Box
        //Switch to the frame first
      //  driver.switchTo().frame(0); // switch to the iframe /1.yONTEM indeks yontemiyle
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"))); // 3.yontem web element ile bulma
      //  driver.switchTo().frame("mce_0_ifr");  //2.yontem id ile bulma

        // WE ARE NOW INSIDE THE FIRST IFRAME
        // IT MEANS WE CAN INTERACT WITH THE ELEMENTS INSIDE THE IFRAME
        WebElement box = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
                                                    //hoca "//p"  seklinde yapti. cok daha kisa xpath
          // Delete the text in the text box
        box.clear(); // clears the box . deletes the text

        // tYPE "this text box is in the iframe"
        box.sendKeys("this text box is in the iframe"); // 2 yontemle de yazabiliyoruz
        driver.findElement(By.xpath("//p")).sendKeys("this text box is in the iframe");

              //!!!! driver is still in the frame. we need to exit
        driver.switchTo().parentFrame(); // YA DA driver.switchTo().defaultContent(); yapabilirz parent bir yukari cikarir. default en yukari cikarir

        WebElement elementalSelenium = driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(elementalSelenium.isDisplayed());


    }

}
