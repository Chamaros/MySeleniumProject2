package MyFirstProject2.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public abstract class TestBase {

      protected static WebDriver driver; //ASLINDA PROTECTED YAPMAK YETERLI / bunu biz class objesi olmadan da tum yerlerde kullanmak icin STATIC YAPTIK


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

}
