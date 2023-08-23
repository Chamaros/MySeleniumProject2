package MyFirstProject2;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day04_JavaFaker {

    @Test
    public void test1(){

        /*
        Where do you get your test data?
       -- Test lead can provide
       -- Business analyst (BA) -they writes the acceptance criteria
        product owner tells the BA ALL HIS NEEDS
        -Team lead/ Tech lead
        --Manual tester-knows the functionality well
        -for mock data I use faker
        IF YOU NEED A CHANGING MOCK DATA THEN WE CAN USE FAKER
        FOR API, I USE SWAGGER
        ALAKASIZ BILGI /SWAGGER DOCUMENT API. THAT CAN ALSO HAVE DATA




         */
        // 1.CREATE FAKER OBJECT
        Faker faker = new Faker();
        // 2.   USE FAKER OBJECT TO GENERATE MOCK
        String firstName = faker.name().firstName();
        System.out.println(firstName);

        //last name
        String lastName = faker.name().lastName();
        System.out.println(lastName);


        // username
        String username = faker.name().username();
        System.out.println(username);

        // title
        String title = faker.name().title();
        System.out.println(title);

        // city
        String city = faker.address().city();
        System.out.println(city);

        // city
        String state = faker.address().state();
        System.out.println(state);

        // full address
        String address = faker.address().fullAddress();
        System.out.println(address);

        // cell phone
        String cellPhone = faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

        // email
        String email = faker.internet().safeEmailAddress();
        System.out.println(email);

        // zip code
        String zipCode = faker.number().digits(5); //random 5 digit number
        System.out.println(zipCode);

    }






}
