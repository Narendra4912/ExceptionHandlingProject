package com.blz.ExceptionHandlingTest;

import com.blz.ExceptionHandlingMain.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class UserValidationTesting {

    private String message;

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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.LASTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.EMAIL_ID_IS_IN_INCORRECT_FORMAT);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.EMAIL_ID_IS_IN_INCORRECT_FORMAT);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.MOBILE_NO_MUST_BE_IN_FORMAT_COUNTRY_CODE_SPACE_MOBILE_NO);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.MINIMUM_8_DIGITS_PASSWORD_LENGTH_SHOULD_BE_THERE);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.PASSWORD_MUST_CONTAIN_AT_LEAST_ONE_CAPITAL_LETTER);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.PASSWORD_MUST_CONTAIN_AT_LEAST_ONE_NUMERIC_LETTER);
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
        catch (CustomEmailException e)
        {
            System.out.println(CustomEmailException.ExceptionType.PASSWORD_MUST_CONTAIN_EXACT_ONE_SPECIAL_SYMBOL);
        }
    }
}
