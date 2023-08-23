package MyFirstProject2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04_DropDown {
    WebDriver driver;


    @Before
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void selectByIndex() {
        driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/");

        // 1. locate the dropdown element
       WebElement dropdownElement =  driver.findElement(By.cssSelector("#pets"));
       // 2.create select class
        Select select = new Select(dropdownElement);
        // 3. select  any option using select object

        // CREATE METHOD selectByIndexTest and select option3 using index
        select.selectByIndex(2);//index starts at zero 0
    }

        @Test
     public void selectByValueTest(){
            driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/");

            // 1. locate the dropdown element
            WebElement dropdownElement =  driver.findElement(By.cssSelector("#pets"));
            // 2.create select class
            Select select = new Select(dropdownElement);
            // 3. select  any option using select object

            // CREATE METHOD selectByValueTest and select option2 by value
            select.selectByValue("dog"); // selecting option 2

        }
    @Test
    public void selectByVisibleTest(){
        driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/");

        // 1. locate the dropdown element
        WebElement dropdownElement =  driver.findElement(By.cssSelector("#pets"));
        // 2.create select class
        Select select = new Select(dropdownElement);
        // 3. select  any option using select object

        // CREATE METHOD selectByVisibleTextTest and select option2 value by visible text
        select.selectByVisibleText("Dog"); // selecting option 2


    }



}