package MyFirstProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class Day02_LocatorsIntro {
    WebDriver driver;
   @Before
   public void setUp()  {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       // ADDING IMPLICITLY WAIT TO HELP SYNCHRONIZATION
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.manage().window().maximize();
   }
@After
        public void tearDown(){

    driver.quit();
}


    @Test
    public   void login(){


        // GOING TO THE URL
       driver.get("https://the-internet.herokuapp.com/login");
      //  driver.get("http://a.testaddressbook.com/sign_in");
        // LOCATING THE EMAIL INPUT
      //  driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        // // LOCATING THE password INPUT
      //  driver.findElement(By.id("session_password")).sendKeys("Test1234!");
       driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        // // LOCATING THE SUBMIT BUTTON
       driver.findElement(By.className("radius")).click();//
        // CLOSE THE DRIVER
     // driver.quit();

     //   Then verify that the expected user id testtechproed@gmail.com
    //  String actualIdText = By.tagName("icon-2x icon-signout").findElement(driver).getText();=GET TEXT 'IN RETURN TYPE STRING
     //   WebElement idelement = driver.findElement(By.className("navbar-text"));FIND ELEMENT 'IN RETURN TYPE Webelement
    //    String expectedIdText = "testtechproed@gmail.com";
   //     Assert.assertEquals(actualIdText,expectedIdText);
        //asagidakikendi siteme gore yaptigim ama olmadi
     //  String actualIdText = driver.findElement(By.className("icon-2x icon-signout")).getText();
     //   String expectedIdText = "Logout";
     //    Assert.assertEquals(actualIdText,expectedIdText);
     //   use getText() method to get the text from the page
    //   verify the addresses and sign out texts are displayed
          WebElement addressElement1 = driver.findElement(By.linkText("Logout"));
        Assert.assertTrue(addressElement1.isDisplayed());
        System.out.println(addressElement1);

        WebElement addressElement2 = driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(addressElement2.isDisplayed());
        System.out.println(addressElement2);

        WebElement actualLogOutLink = driver.findElement(By.linkText("Logout"));
        Assert.assertTrue(actualLogOutLink.isDisplayed());
        System.out.println(actualLogOutLink);
    //    Find the number of total link on the page


        // a tag is used to create link
       List<WebElement> LinkList =  driver.findElements(By.tagName("a"));// returns the total number of link on the page
        int numOfLink = LinkList.size();
        System.out.println("Number of Link is "+ numOfLink);
        //TO PRINT ALL THE LINK NAME
        for (WebElement eachElement: LinkList){
            System.out.println(eachElement.getText());
        }

//    Find the number of total image on the page
        // img tag is used to create image
      List<WebElement> ImageList =  driver.findElements(By.tagName("img"));// returns the total number of image on the page
        int numOfImage = ImageList.size();
        System.out.println("Number of Image is "+ numOfImage);
        // Print all link names
        for (WebElement eachElement: LinkList){
            System.out.println(eachElement.getText());
        }
    //    sign out from the page  // 3 farkli yontem dende sign out yapabiliyorum
    //    driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
      driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();
      //  driver.findElement(By.xpath("//a[@href='/logout']")).click(); // bu da oluyor cikis icin diger yontem

      /*
      WE ARE able to click on the sign out button
      we need to assert the sign out functionality works
      we can locate a core element for assertion
      or we  can use URL for assertion
      signout URL:   bu da signout oncesi page URL//https://the-internet.herokuapp.com/secure
      Assert thar after click on signout, the URL  should be     https://the-internet.herokuapp.com/login
       */
     String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://the-internet.herokuapp.com/login", currentUrl); // PROGRAMIN BANA ONERDIGI YAZMA SEKLI
       // Assert.assertTrue(currentUrl.equals("https://the-internet.herokuapp.com/login"));
        /*
        getText is used to get the text of a webelement. This returns a string.
        isDisplayed() is used to check if  an element is on the page or not.This returns a boolean
         */




    }
}
