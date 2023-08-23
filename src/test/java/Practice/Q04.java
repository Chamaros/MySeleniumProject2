package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Q04 {

    WebDriver driver;

    @Before
    public void setUp(){

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @After
      public void tearDown(){

    }

    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//*[@id=\"calculatetest\"]")).click();

        // ENTERING THE FIRST NUMBER
        driver.findElement(By.xpath("//*[@id=\"number1\"]")).sendKeys("10");

        // ENTERING THE PROCESS
        driver.findElement(By.xpath("//*[@id=\"function\"]")).sendKeys("times");

        // ENTERING THE FIRST NUMBER
        driver.findElement(By.xpath("//*[@id=\"number2\"]")).sendKeys("2");

        //PRESSING CALCULATE BUTTON
        driver.findElement(By.xpath("//*[@id=\"calculate\"]")).click();

        // SHOWING THE RESULT
  //   String result =  driver.findElement(By.xpath("//*[@id=\"answer\"]")).getText();
     //   System.out.println( driver.findElement(By.xpath("//*[@id=\"answer\"]")).getText());



    }

}
