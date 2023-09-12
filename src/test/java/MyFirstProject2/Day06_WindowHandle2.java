package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class Day06_WindowHandle2 extends TestBase {

    @Test
    public void newWindowTest (){
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

       driver.switchTo().window(TechproWindowHandle);




    }







}
