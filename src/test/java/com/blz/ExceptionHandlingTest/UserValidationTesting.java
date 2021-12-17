package com.blz.ExceptionHandlingTest;

import com.blz.ExceptionHandlingMain.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class UserValidationTesting {

    @Before
    public void setUpBeforeEnvironment() {
        System.out.println("Inside the @Before Method");
    }

    @After
    public void setUpAfterEnvironment() {
        System.out.println("Inside the @After Method");
    }

    @Test
    public void givenFirstNameShouldPassWhenFirstNameRulesSatisfied() {

        try
        {
            String firstName = "abc";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validUserFirstName(firstName);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("First name must starts with a Capital Letter and maximum length should be 3 !!!");
        }

    }

    @Test
    public void givenLastNameShouldPassWhenLastNameRulesSatisfied() {

        try
        {
            String lastName = "xyzd";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validUserLastName(lastName);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Last name must starts with a Capital Letter and maximum length should be 3 !!!");
        }
    }


    @Test
    public void givenEmailShouldPassWhenEmailRulesSatisfied() {

        //Happy Email testing
        String email = "abc.xyz@domain.co.in";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validEmailAddress(email);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmailShouldPassWhenEmailRulesSatisfied2() {

        //Sad Email testing
        String email = "abc.xyz@domain.co.india";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validEmailAddress(email);
        boolean expectedResult = true;
        Assert.assertNotEquals(expectedResult, actualResult);
    }

    @Test
    public void givenMobileNoShouldPassWhenMobileNoRulesSatisfied() {

        String mobileNo = "91 9876543210";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validMobileNo(mobileNo);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordIs8DigitInLength() {

        String password = "abcdefgh";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validPasswordLength(password);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasMinimum1CapitalLetter() {

        String password = "Abcdefgh";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validPasswordUpperLetter(password);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasMinimum1NumericLetter() {

        String password = "Abcde1gh";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validPasswordNumericLetter(password);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasExact1SpecialLetter() {

        String password = "Abcd@1gh";
        UserValidation user = new UserValidation();
        boolean actualResult = user.validPasswordSpecialSymbol(password);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
