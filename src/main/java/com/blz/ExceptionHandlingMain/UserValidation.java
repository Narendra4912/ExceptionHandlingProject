package com.blz.ExceptionHandlingMain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    String firstName, lastName, email, mobileNo, password;
    String message;

    public boolean validUserFirstName (String firstName) throws CustomEmailException {
        this.firstName = firstName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG");
        }
    }

    public boolean validUserLastName(String lastName) throws CustomEmailException
    {
        this.lastName = lastName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG");
        }
    }

    public boolean validEmailAddress(String email) throws CustomEmailException
    {
        this.email = email;
        String regex = "^[a-z0-9]{3,20}([+._-][a-z0-9]+)?@[a-z0-9]+.[a-z0-9]{2,3}(.[a-z]{2})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("EMAIL_ID_IS_IN_INCORRECT_FORMAT");
        }
    }

    public boolean validMobileNo(String mobile) throws CustomEmailException
    {
        this.mobileNo = mobile;
        String regex = "^[1-9]{2}( )[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(mobileNo));

        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("MOBILE_NO_MUST_BE_IN_FORMAT_COUNTRY_CODE_SPACE_MOBILE_NO");
        }
    }

    public boolean validPassword(String password) {

        this.password = password;
        String regex="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
        {
            return false;
            //throw new CustomEmailException("FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG");
        }
    }

    public boolean validPasswordLength(String password) throws CustomEmailException {

        this.password = password;
        String regex=".{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("MINIMUM_8_DIGITS_PASSWORD_LENGTH_SHOULD_BE_THERE");
        }
    }

    public boolean validPasswordUpperLetter(String password) throws CustomEmailException {

        this.password = password;
        String regex="(?=.*[A-Z]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("PASSWORD_MUST_CONTAIN_AT_LEAST_ONE_CAPITAL_LETTER");
        }
    }

    public boolean validPasswordNumericLetter(String password) throws CustomEmailException {

        this.password = password;
        String regex="(?=.*[0-9]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("PASSWORD_MUST_CONTAIN_AT_LEAST_ONE_NUMERIC_LETTER");
        }
    }

    public boolean validPasswordSpecialSymbol(String password) throws CustomEmailException {

        this.password = password;
        String regex="(?=.*[!@#$%^&*]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
            return true;
        else
        {
            throw new CustomEmailException("PASSWORD_MUST_CONTAIN_EXACT_ONE_SPECIAL_SYMBOL");
        }
    }
}
