package MyFirstProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Day04_cssSelector {

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
        //driver.quit();
   }
   @Test
    public void Test (){

        driver.get("https://the-internet.herokuapp.com/login");
       driver.findElement(By.cssSelector("input[type='text']")).sendKeys("tomsmith");
       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperSecretPassword!");
  //  driver.findElement(By.cssSelector("i[class='fa fa-2x fa-sign-in']")).click();
     // // asagidaki gibi de yazabilirim
       driver.findElement(By.cssSelector("i[.fa fa-2x fa-sign-in]")).click();

   }


}
