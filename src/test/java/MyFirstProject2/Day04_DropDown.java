package MyFirstProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

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
        WebElement dropdownElement = driver.findElement(By.cssSelector("#pets"));
        // 2.create select class
        Select select = new Select(dropdownElement);
        // 3. select  any option using select object

        // CREATE METHOD selectByIndexTest and select option3 using index
        select.selectByIndex(2);//index starts at zero 0
    }

    @Test
    public void selectByValueTest() {
        driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/");

        // 1. locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.cssSelector("#pets"));
        // 2.create select class
        Select select = new Select(dropdownElement);
        // 3. select  any option using select object

        // CREATE METHOD selectByValueTest and select option2 by value
        select.selectByValue("dog"); // selecting option 2

    }

    @Test
    public void selectByVisibleTest() {
        driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/");

        // 1. locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.cssSelector("#pets"));
        // 2.create select class
        Select select = new Select(dropdownElement);
        // 3. select  any option using select object

        // CREATE METHOD selectByVisibleTextTest and select option2 value by visible text
        select.selectByVisibleText("Dog"); // selecting option 2
    }

    // 4.CREATE METHOD PRINT ALLTEST PRINT ALL DROPDOWN VALUE
    @Test
    public void printAllTest() {
        driver.get("https://app.endtest.io/guides/docs/how-to-test-dropdowns/");

        // 1. locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.cssSelector("#pets"));
        // 2.create select class
        Select select = new Select(dropdownElement);
        // get all og the dropdown options
         List<WebElement> allOptions = select.getOptions();
         for (WebElement eachOption:allOptions) {
           //  System.out.println(eachOption); // WEB ELEMENT KODLARINI GETIRIR
             System.out.println(eachOption.getText()); // normal gordugumuz yazi halinda gosterir
         }
        // 5. Verify the dropdown has option 2 text
        //  boolean flag = false;
        for (WebElement eachOption : allOptions){
            if(eachOption.getText().equals("Rabbit")){
          //      flag=true;
                System.out.println("Rabbit exist");
            } else System.out.println("Rabbit does not exist");


        }
      //  Assert.assertTrue(flag);//FAILS if flag is false. PASS if flag is true. It will be true if dropdown has option 2
        // 6.create method print first selected option
        WebElement firstSelectedOption  = select.getFirstSelectedOption();
        System.out.println("DEFAULT SELECTED OPTION: "+ firstSelectedOption.getText());

        // 7. find the size of the dropdown, print "Expected is not Equal Actual" if there are not 3 elements in dropdown
        System.out.println("Total number of element in dropdown is "+ allOptions.size());
        int dropdownSize = allOptions.size();
        Assert.assertEquals("Expected is not equal to actual",3,dropdownSize);



         }




    }
