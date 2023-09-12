package Practice;

import MyFirstProject2.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q05_iFrame extends TestBase {

    @Test
    public void  iFrameTest() throws InterruptedException {

        driver.get("https://html.com/tags/iframe");


       driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-164\"]/div/div[3]/iframe")));
       driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();

      Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
                    //button[@class='ytp-button ytp-search-button ytp-show-search-title']
      driver.switchTo().defaultContent(); //KAPATMASAM DA OLUYOR. HATA VERMIYOR

    }




}
