package MyFirstProject2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04_RadioButton {

    WebDriver driver;
    Faker faker = new Faker();


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
 @Test
     public void signUpAccount  (){
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Yeni hesap oluştur")).click();

            //entering first name
       // driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ahmet");
        driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());


     //entering last name
     // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ahmet");
     driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());


    // BEN EMAIL YAPMISTIM.HOCA  PHONE YAPTI

String email = faker.internet().emailAddress();
     //entering email OR PHOne
     // driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ahmet111@gmail.com");
   //  driver.findElement(By.name("reg_email__")).sendKeys(faker.phoneNumber().cellPhone());
     driver.findElement(By.name("reg_email__")).sendKeys(email);
     //entering email AGAIN
     // driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ahmet111@gmail.com");
   driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);

     //entering password
     // driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Emir199871.");
     driver.findElement(By.name("reg_passwd__")).sendKeys(faker.internet().password());

     // BENIM YONTEM

     // entering birth date DAY
     // driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("21");
     driver.findElement(By.name("birthday_day")).sendKeys("21");

     // entering birth date month
     // driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Tem");
     driver.findElement(By.name("birthday_month")).sendKeys("Tem");

     // entering birth date year
     // driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1982");
     driver.findElement(By.name("birthday_year")).sendKeys("1982");

   /// HOCANIN TARIH YONTEMI
   //   JAN 10 2000
     // DAY
     //1. LOCATE THE DAY DROPDOWN
     //2. CREATE SELECT
     // 3.
     // entering birth date DAY
     WebElement dayDropdownElement = driver.findElement(By.name("birthday_day"));
     Select selectday = new Select(dayDropdownElement);
     selectday.selectByValue("10");

     // entering birth date MONTH

   WebElement monthDropdownElement = driver.findElement(By.name("birthday_month"));
    Select selectmonth = new Select(monthDropdownElement);
   // selectmonth.selectByVisibleText("Haz");
    selectmonth.selectByIndex(5);


     // entering birth date year 3 YONTEMLE YAPILDI

     WebElement yearDropdownElement = driver.findElement(By.name("birthday_year"));
        Select select2 = new Select(yearDropdownElement);
       // select2.selectByIndex(23);// EN BASTAKINI SIFIR OLARAK SAYDIM ASAGI KADAR 23. 2000 YILI OLDU
       // select2.selectByVisibleText("2000");
        select2.selectByValue("2000");

     // entering gender
     driver.findElement(By.xpath("//input[@value='2']")).click();
     // driver.findElement(By.id("u_2_4_4I")).click();

     // Submit button
    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
 }






}