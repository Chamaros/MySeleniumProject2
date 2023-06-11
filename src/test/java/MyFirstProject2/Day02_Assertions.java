package MyFirstProject2;

import org.junit.Assert;
import org.junit.Test;

public class Day02_Assertions {
    @Test
    public void assertions() {
  /*
        Assertion is done to check if expected equals to action
        green check mark -> PASS
        yellow x -> fail

        Assert.assertTrue(true);// PASS
         Assert.assertTrue(false);// fail

          Assert.assertFalse(false);// PASS
           Assert.assertFalse(true);// Fail
         */
        // Assert.assertEquals(4,5);
        // If test case fails, then test execution stops
        Assert.assertEquals(5, 5);
        Assert.assertEquals("apple", "apple");
        Assert.assertEquals(false, false);

        //     Assert.assertTrue("Apple".equals("apple")); // THIS IS HARD ASSERTION test will fail
        if ("Apple".equals("apple")) {
            // VERIFICATION: IF THE STATEMENT FAILS TEST CASE WILL CONTINUE TO EXECUTE
            // WE DO NOT USE IF STATEMENT .WE USE HARD
        }
        Assert.assertFalse("Apple".equals("apple"));//PASS
        Assert.assertTrue("apple".equals("apple")); // pass

    }
}
