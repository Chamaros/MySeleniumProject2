package MyFirstProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_Checkbox {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
   @After
   public void tearDown  (){
        driver.quit();
   }
    @Test
    public void checkboxTest() {
        // go to https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        // Locate the element of the checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        // Then click on checkbox1 if box is not selected
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
        // Then click on checkbox2 if box is not selected
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

            // HOMEWORK then verify that checkbox1 is checked.
        Assert.assertTrue(checkbox1.isSelected());

        /*
        isSelected() is used to check if a checkbox or radio button is selected
        if a checkbox is selected then this returns true
        if it is not selected then return false
         */


    }

}