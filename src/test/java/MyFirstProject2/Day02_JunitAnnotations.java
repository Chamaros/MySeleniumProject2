package MyFirstProject2;

import org.junit.*;

public class Day02_JunitAnnotations {
      /*
    @Test is used to create test cases
    All test methods should be void
    we can not run methods without @test @ isareti olmadan kullanamyiz.
    @BeforeClass is used to run once before the entire class
    @BeforeClass is also used for PRECONDITION

    @AfterClass is used to run once before the entire class
    @AfterClass is also used for AFTERCONDITION

    @Before is used to run before each @Test method
    @After is used to run after each @Test method

    @Ignore is used to skip or ignore a @test method
     */

    // @BeforeClass  // bunu tek basina run edemem. mutlaka bir @test ile birlikte kullanabilirim.
    // zaten goruldugu gibi yaninda yesil ucgen buton yok

    @BeforeClass
    public static void setUpClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After Class");
    }
    @Before
    public void setUpMethod(){
        System.out.println("Before Method");
        }
    @After
    public void tearDownMethod(){
        System.out.println("After Method");
    }

    @Test @Ignore
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
    }

}