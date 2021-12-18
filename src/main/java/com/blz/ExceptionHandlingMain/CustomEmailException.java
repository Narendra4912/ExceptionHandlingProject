package com.blz.ExceptionHandlingMain;

public class CustomEmailException extends Exception{

    public String message;

    public CustomEmailException(String message) {
        this.message = message;
    }

    public enum ExceptionType
    {
        FIRSTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG,
        LASTNAME_MUST_START_WITH_CAPITAL_LETTER_AND_MUST_BE_3_DIGITS_LONG,
        EMAIL_ID_IS_IN_INCORRECT_FORMAT,
        MINIMUM_8_DIGITS_PASSWORD_LENGTH_SHOULD_BE_THERE,
        PASSWORD_MUST_CONTAIN_AT_LEAST_ONE_CAPITAL_LETTER,
        PASSWORD_MUST_CONTAIN_AT_LEAST_ONE_NUMERIC_LETTER,
        PASSWORD_MUST_CONTAIN_EXACT_ONE_SPECIAL_SYMBOL,
        MOBILE_NO_MUST_BE_IN_FORMAT_COUNTRY_CODE_SPACE_MOBILE_NO
    }

    @Override
    public String toString() {
        return "CustomEmailException{" +
                "message='" + message + '\'' +
                '}';
    }
}
