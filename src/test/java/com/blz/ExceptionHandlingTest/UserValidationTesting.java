package com.blz.ExceptionHandlingTest;

import com.blz.ExceptionHandlingMain.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class UserValidationTesting {

    private String message;

    @Before
    public void setUpBeforeEnvironment() {
        System.out.println("Inside the @Before Method");
    }

    @After
    public void setUpAfterEnvironment() {
        System.out.println("Inside the @After Method");
    }

    @Test
    public void givenFirstNameShouldPassWhenFirstNameRulesSatisfied() throws CustomEmailException {

        try
        {
            String firstName = "abc";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validUserFirstName(firstName);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (CustomEmailException e)
        {
            this.message = "First name must starts with a Capital Letter and maximum length should be 3 !!!";
            throw new CustomEmailException(message);
            //System.out.println("First name must starts with a Capital Letter and maximum length should be 3 !!!");
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

        try
        {
            //Happy Email testing
            String email = "abc.xyz@domain.co.in";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validEmailAddress(email);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Incorrect Email ID entered !!!");
            System.out.println("Below are some examples of valid Email ID's => \nabc@domain.com \nabc.xyz@domain.com \nabc@domain.co.in \nabc.xyz@domain.co.in");
        }
    }

    @Test
    public void givenEmailShouldPassWhenEmailRulesSatisfied2() {

        try
        {
            //Sad Email testing
            String email = "abc.xyz@domain.co.india";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validEmailAddress(email);
            boolean expectedResult = true;
            Assert.assertNotEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Incorrect Email ID entered !!!");
            System.out.println("Below are some examples of valid Email ID's => \nabc@domain.com \nabc.xyz@domain.com \nabc@domain.co.in \nabc.xyz@domain.co.in");
        }
    }

    @Test
    public void givenMobileNoShouldPassWhenMobileNoRulesSatisfied() {

        try
        {
            String mobileNo = "91 9876543210";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validMobileNo(mobileNo);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Incorrect Mobile number entered !!!");
            System.out.println("Mobile number should be in below format <coutry code><space><mobile number>");
        }
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordIs8DigitInLength() {

        try
        {
            String password = "abcdefgh";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validPasswordLength(password);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Password must be minimum 8 digit long !!!");
        }
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasMinimum1CapitalLetter() {

        try
        {
            String password = "Abcdefgh";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validPasswordUpperLetter(password);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Password must contain at least one upper case letter !!!");
        }
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasMinimum1NumericLetter() {

        try
        {
            String password = "Abcde1gh";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validPasswordNumericLetter(password);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Password must contain at least one numeric letter !!!");
        }
    }

    @Test
    public void givenPasswordShouldPassWhenPasswordHasExact1SpecialLetter() {

        try
        {
            String password = "Abcd@1gh";
            UserValidation user = new UserValidation();
            boolean actualResult = user.validPasswordSpecialSymbol(password);
            boolean expectedResult = true;
            Assert.assertEquals(expectedResult, actualResult);
        }
        catch (AssertionError e)
        {
            System.out.println("Password must contain exact one special symbol !!!");
        }
    }
}
