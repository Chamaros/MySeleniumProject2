package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Day05_GoogleSearchTest extends TestBase {

    @Test
    public void GoogleSearch(){
        driver.get("https://google.com/");
        // Instructor un yaptigi YONTEM
       driver.findElement(By.name("q")).sendKeys("porcelain Teapot"+ Keys.ENTER);
       // YUKARIDAKI SEARCH THEN CLICK ENTER ANLAMINA GELIYOR

        // BENIM YAPTIGIM YONTEM
    //   driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
     //   driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("porcelain Teapot");
     //   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
      System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
    }
}
