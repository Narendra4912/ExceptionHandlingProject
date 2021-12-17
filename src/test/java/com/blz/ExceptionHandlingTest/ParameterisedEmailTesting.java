package com.blz.ExceptionHandlingTest;

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
    private String regex = "^[a-z0-9]{3,20}([+._-][a-z0-9]+)?@[a-z0-9]+.[a-z0-9]{2,3}(.[a-z]{2})?$";
    private Pattern pattern = Pattern.compile(regex);
    private Matcher matcher = pattern.matcher(email);
    private boolean expectedResult = true;

    public ParameterisedEmailTesting(String email) {
        this.email = email;
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

    @Test
    public void givenEmailWhenEMailShouldReturnValidEmail()
    {
        Assert.assertEquals(expectedResult, matcher.matches());
    }
}
