package com.blz.ExceptionHandlingMain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    String firstName, lastName, email, mobileNo, password;

    public boolean validUserFirstName throws CustomEmailException(String firstName)
    {
        this.firstName = firstName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validUserLastName(String lastName)
    {
        this.lastName = lastName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validEmailAddress(String email)
    {
        this.email = email;
        String regex = "^[a-z0-9]{3,20}([+._-][a-z0-9]+)?@[a-z0-9]+.[a-z0-9]{2,3}(.[a-z]{2})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validMobileNo(String mobile)
    {
        this.mobileNo = mobile;
        String regex = "^[1-9]{2}( )[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(mobileNo));

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validPassword(String password) {

        this.password = password;
        String regex="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validPasswordLength(String password) {

        this.password = password;
        String regex=".{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validPasswordUpperLetter(String password) {

        this.password = password;
        String regex="(?=.*[A-Z]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validPasswordNumericLetter(String password) {

        this.password = password;
        String regex="(?=.*[0-9]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validPasswordSpecialSymbol(String password) {

        this.password = password;
        String regex="(?=.*[!@#$%^&*]).{8,12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
            return true;
        else
            return false;
    }
}
