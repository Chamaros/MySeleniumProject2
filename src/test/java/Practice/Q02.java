package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    WebDriver driver;


@Before
 public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();
}
@After
 public void tearDown(){
    driver.quit();
}
  @Test
    public void Test() throws InterruptedException {
     driver.get("https://www.google.com/");
      System.out.println(driver.getTitle());
      // asagidaki gibi string konteynira alip da yapabilirdim
   //   String amazonTitle = driver.getTitle();
   //   if(amazonTitle.contains("Smile")){

   //   } seklinde de yapabilirdim
      System.out.println(driver.getCurrentUrl());

     Thread.sleep(3000);

     driver.navigate().to("https://www.amazon.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());

      if (driver.getTitle().contains("Smile")) {
          System.out.println("Title contains Smile");

      }else
          System.out.println("Title does not contains smile");


      if (driver.getCurrentUrl().contains("auto")) {
          System.out.println("Url contains auto");

      }else {
          System.out.println("URL does not contains auto");
      }
      driver.navigate().to("https://techproeducation.com/");
      if (driver.getTitle().contains("site")) {
          System.out.println("Title contains smile");

      }else {
          System.out.println("Title does not contains site");
      }
      driver.navigate().back();
      driver.navigate().refresh();
      driver.navigate().forward();
      Thread.sleep(3000);
  }









}