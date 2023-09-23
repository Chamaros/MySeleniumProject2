package MyFirstProject2;

import MyFirstProject2.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day07_Cookies extends TestBase {
    @Test
    public void cookieTest(){
        driver.get("https://www.amazon.com.tr");

        //1. find the total number of cookies
       Set<Cookie>  allcookies = driver.manage().getCookies();
       int cookieSize = allcookies.size();
        System.out.println("Original cookie size : "+cookieSize); // HOCADA 7 TANE COOKIE CIKTI

       //2. print all the cookies
        for (Cookie eachCookie:allcookies) {
            System.out.println("Cookie: "+eachCookie);
        }
        for (Cookie eachCookie:allcookies) {
            System.out.println("Cookie name: "+eachCookie.getName());
        }
        for (Cookie eachCookie:allcookies) {
            System.out.println("Cookie domain: "+eachCookie.getDomain());
        }
        for (Cookie eachCookie:allcookies) {
            System.out.println("Cookie path: "+eachCookie.getPath());
        }
        for (Cookie eachCookie:allcookies) {
            System.out.println("Cookie value: "+eachCookie.getValue());
        }
        for (Cookie eachCookie:allcookies) {
            System.out.println("Cookie expiry: "+eachCookie.getExpiry());
        }
        // 3.Get the cookies by their name
        System.out.println("GET COOKIE NAMED: "+ driver.manage().getCookieNamed("i18n-prefs"));

        // 4.Add Cookie
        Cookie cookie = new Cookie("My-Fav-Cookie","white chocolate");
        driver.manage().addCookie(cookie);
        Set<Cookie> newCookies = driver.manage().getCookies();
        System.out.println("new cookie number-size: "+ newCookies.size());

        //Delete Cookie by name
        driver.manage().deleteCookieNamed("session-id");
        Set<Cookie> newCookieV1 =driver.manage().getCookies();
        System.out.println("new cookie number-size: "+ newCookieV1.size());

        // //Delete All Cookie
        driver.manage().deleteAllCookies();
        Set<Cookie> newCookieV2 =driver.manage().getCookies();
        System.out.println("new cookie number-size: "+ newCookieV2.size());

    }








}
