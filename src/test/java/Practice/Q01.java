package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
    /*
    create a new class under q01
    set path
    create chrome driver
    maximize the window
    open google homepage https://www.google.com/
    on the same class navigate to amazon homepage https://www.amazon.com/
    navigate back to google
    navigate forward to amazon
    refresh the page
    close / quit the browser
    and print "all okey" on the console
     */
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        System.out.println("ALL OK");
        driver.quit();
    }
    @Test
    public void Test() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();

    }






}
