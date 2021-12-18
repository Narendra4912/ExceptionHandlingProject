package com.blz.ExceptionHandlingMain;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        String firstName, lastName, email;
        String mobileNo, password;

        UserValidation user = new UserValidation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User's First Name = ");
        firstName = sc.next();
        //user.validUserFirstName(firstName);

        System.out.println("Enter User's Last Name = ");
        lastName = sc.next();
        //user.validUserLastName(lastName);

        System.out.println("Enter User's Email Address  = ");
        email = sc.next();
        //user.validEmailAddress(email);

        System.out.println("Enter User's Mobile No = ");
        mobileNo = sc.nextLine();
        //user.validMobileNo(mobileNo);

        System.out.println("Enter User's Password = ");
        password = sc.nextLine();
        //user.validPassword(password);
    }
}
