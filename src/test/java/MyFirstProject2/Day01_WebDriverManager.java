package MyFirstProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_WebDriverManager {
    public static void main(String[] args) {
        //1. Setup chrome Driver. No longer System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriverManager.chromedriver().setup();

        // REST IS THE SAME
        // 2.CREATE WEBDRIVER OBJECT
        WebDriver driver = new ChromeDriver();

        // 3. write your test cases
        //        driver.get("https://www.google.com");
        driver.get("https://www.techproeducation.com");
        driver.quit();
    }
}
