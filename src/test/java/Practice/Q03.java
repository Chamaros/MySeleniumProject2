package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Q03 {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
       // driver.quit();
    }

    @Test
    public void test()  throws ElementClickInterceptedException {
        // BENIM YONTEM VE DE INSTRUCTOR YONTEMI
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

       // driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Huseyin");
        WebElement firstnameBox = driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input"));
        firstnameBox.sendKeys("John");

        // LAST NAME
        // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KARAKAS");
        WebElement lastnameBox = driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input"));
        lastnameBox.sendKeys("Doe");
        // COOKIE ONCESI X BUTONU KAPATMAK ICIN
        driver.findElement(By.xpath("//*[@id=\"ezmob-footer-close\"]")).click();
        // COOKIES ISARETLEMEK ICIN--bende ise yaramadi
       driver.findElement(By.xpath("//*[@id=\"cookieChoiceDismiss\"]")).click();

        //GENDER -
       // driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
        // EXPERIENCE
       driver.findElement(By.xpath("//input[@id='exp-0']")).click();

      // Enter Date
         driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("21.07.2000");

        // Select Profession
  //   driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
        // Select Automation Tool
     driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
        // Select Continent
    driver.findElement(By.xpath("//*[@id=\"continents\"]")).sendKeys("Ant");
    //  driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();

        // Select Command
     driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();

        // Click Submit
      driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

    /*
    WEB SITESINDEKI CEVAP ANAHTARI BENDE CALISMADI
        // Enter Date
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
        // Select Profession
        driver.findElement(By.id("profession-1")).click();
        // Select Automation Tool
        driver.findElement(By.id("tool-2")).click();

        // Select Continent
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

        // Select Command
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

        // Scroll Vertical
        // js.executeScript("window.scrollTo(0,675.5555419921875)");

        // Click Submit
        driver.findElement(By.id("submit")).click();



      */






    }
}
