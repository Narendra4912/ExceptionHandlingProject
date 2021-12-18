package com.blz.ExceptionHandlingTest;

import com.blz.ExceptionHandlingMain.UserValidation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(Parameterized.class)
public class ParameterisedEmailTesting {

    private String email;
    UserValidation user = new UserValidation();
    private boolean expectedResult;

    public ParameterisedEmailTesting(String email, boolean expectedResult) {

        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection checkEmails()
    {
        return Arrays.asList(new Object[][]{
                {"abc@domain.com", true},
                {"abc.xyz@domain.com", true},
                {"abc@domain.co.in", true},
                {"abc.xyz@domain.co.in", true}
        });
    }

//    @Test
//    public void givenEmailWhenEMailShouldReturnValidEmail()
//    {
//        Assert.assertEquals(this.expectedResult, user.validEmailAddress(this.email));
//    }
}
