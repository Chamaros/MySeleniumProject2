package MyFirstProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();

        driver.get("https://techproeducation.com/"); //RETURNS THE PAGE TITLE
        driver.manage().window().maximize();

       // GET TITLE
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps"; //yanlis yapmak icin Course yerine Coursess yazdim
        // Verify if actualTitle = expectedTitle
         if(actualTitle.equals(expectedTitle)){
             System.out.println("PASS");
         }else System.out.println("FAIL");
        System.out.println(actualTitle +" is ACTUAL TITLE");
        System.out.println(expectedTitle +" is expected Title");

        String actualURL = driver.getCurrentUrl();
        String expectedUrl = "https://techproeducation.com/";

         //verify
        if (actualURL.equals(expectedUrl)){
            System.out.println("PASS");
        }else System.out.println("FAIL");
        System.out.println(actualURL+" is actual URL");
        System.out.println(expectedUrl+" is expected URL");

        driver.quit();
    }
}
