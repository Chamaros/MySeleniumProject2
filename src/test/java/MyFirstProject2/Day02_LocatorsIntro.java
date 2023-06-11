package MyFirstProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_LocatorsIntro {
    @Test
    public void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // GOING TO THE URL
        driver.get("https://id.heroku.com/login");

        // LOCATING THE EMAIL INPUT
        driver.findElement(By.id("email")).sendKeys("testtechproed@gmail.com");

        // // LOCATING THE password INPUT
        driver.findElement(By.id("password")).sendKeys("Test1234!");

        // // LOCATING THE SUBMIT BUTTON
        driver.findElement(By.name("commit")).click();

        // CLOSE THE DRIVER
        driver.quit();
    }
}
