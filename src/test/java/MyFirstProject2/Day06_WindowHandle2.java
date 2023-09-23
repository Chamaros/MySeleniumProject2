package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

import java.sql.Driver;

public class Day06_WindowHandle2 extends TestBase {

    @Test
    public void newWindowTest () throws InterruptedException {
        //open Techpro on window 1
        driver.get("https://www.techproeducation.com");
        System.out.println("techpro Title : "+driver.getTitle());
        String TechproWindowHandle = driver.getWindowHandle();



        // OPEN AMAZON ON A NEW WINDOW 2
         driver.switchTo().newWindow(WindowType.WINDOW);// CREATE AND SWITCH A NEW WINDOW
        driver.get("https://www.amazon.com");
        System.out.println("Amazon Title : "+driver.getTitle());
       String amazonWindowHandle = driver.getWindowHandle();

        // OPEN linkedin ON A NEW WINDOW 3
        driver.switchTo().newWindow(WindowType.WINDOW);// CREATE AND SWITCH A NEW WINDOW
        driver.get("https://www.linkedin.com");
        System.out.println("Linkedin Title : "+driver.getTitle());
       String LinkedinWindowHandle = driver.getWindowHandle();


        Thread.sleep(2000);
        driver.switchTo().window(TechproWindowHandle);

        Thread.sleep(2000);
        driver.switchTo().window(amazonWindowHandle);

        Thread.sleep(2000);
        driver.switchTo().window(LinkedinWindowHandle);

    }
        @Test
    public  void newTabTest() throws InterruptedException {
            //open Techpro on window 1
            driver.get("https://www.techproeducation.com");
            System.out.println("techpro Title : "+driver.getTitle());
            String TechproWindowHandle = driver.getWindowHandle();

            // OPEN A NEW TAB AND SWITCH
            driver.switchTo().newWindow(WindowType.TAB);// CREATE AND SWITCH A NEW WINDOW
            driver.get("https://lms.techproeducation.com/");
            String lmsTitle = driver.getTitle();
            System.out.println("lms title: "+lmsTitle);
            String lmsWindowHandle = driver.getWindowHandle();

            Thread.sleep(3000);

            // if I want to go back to techproeducation main tab I can easily switch
            driver.switchTo().window(TechproWindowHandle);
            System.out.println("TechproURL: "+driver.getCurrentUrl()+" "+ driver.getTitle());

            // if I want to go back to LMS tab again I can easily switch
            driver.switchTo().window(lmsWindowHandle);
            System.out.println("LMS-URL: "+driver.getCurrentUrl()+" "+ driver.getTitle());

        }






}
