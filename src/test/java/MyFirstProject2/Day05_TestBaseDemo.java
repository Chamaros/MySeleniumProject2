package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Test;

public class Day05_TestBaseDemo extends TestBase {

    @Test
    public void Test1(){
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getTitle());
    }

@Test
    public void Test2(){
    driver.get("https://www.amazon.com");
    System.out.println(driver.getTitle());

}





}
