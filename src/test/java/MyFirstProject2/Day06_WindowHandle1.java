package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class Day06_WindowHandle1 extends TestBase {

    @Test
    public void windowHandleTest() throws InterruptedException {
        // given user is on the https://the-internet.herokuapp.com/windows

        driver.get("https://the-internet.herokuapp.com/windows");

        //verify the window1 URL is https://the-internet.herokuapp.com/windows
        String window1URL = driver.getCurrentUrl();
        Assert.assertEquals("https://the-internet.herokuapp.com/windows",window1URL);

        //click on the click here link
        driver.findElement(By.linkText("Click Here")).click();

        //verify the window2 URL is https://the-internet.herokuapp.com/windows/new


        // GET WINDOW1 HANDLE
        String window1Handle = driver.getWindowHandle(); // getting the Id of window 1
        System.out.println(window1Handle);

        Set<String> allWindowHandles =  driver.getWindowHandles();
        System.out.println(allWindowHandles);

        for (String eachHandle: allWindowHandles) {
            if (!eachHandle.equals(window1Handle)){
                driver.switchTo().window(eachHandle);
                System.out.println(eachHandle); // getting the Id of window 2 .asagida da bir tane daha window 2 var
                break;

            }

        }
          // Verify the window2 URL is https://the-internet.herokuapp.com/windows/new
        String window2URL = driver.getCurrentUrl();
        System.out.println(window2URL);
        Assert.assertEquals("https://the-internet.herokuapp.com/windows/new",window2URL);
        String window2Handle = driver.getWindowHandle();//// getting the Id of window 2
        System.out.println(window2Handle); // getting the Id of window 2

        // GO BACK TO WINDOW1 AND PRINT URL
        driver.switchTo().window(window1Handle);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        // GO BACK TO WINDOW2 AND PRINT URL
        driver.switchTo().window(window2Handle);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        // GO BACK TO WINDOW1 AND PRINT URL
        driver.switchTo().window(window1Handle);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        // GO BACK TO WINDOW2 AND PRINT URL
        driver.switchTo().window(window2Handle);
        System.out.println(driver.getCurrentUrl());


        // then user verifies the text : "Opening a new window"
        //Then user verifies the title of the page is "The Internet"
        // when user clicks  on the "Click Here" button
        //Then user verifies the new window title is "New Window"
        // then user verifies the text : "New Window"
        //WHEN user goes back to the previous window and then verifies the title:"The Internet"


    }
}
