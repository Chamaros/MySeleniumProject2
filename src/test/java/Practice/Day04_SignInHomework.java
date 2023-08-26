package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Day04_SignInHomework {
    // enter all required fields and verify the account creation is successful
    // go to http://automationpractice.com/index.php
    // click on sign in link
    // Create account
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
      // driver.quit();
 }
  @Test
    public void createAccount(){
      driver.get("http://automationpractice.com/index.php");

  }



}