package com.example.seller.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class Validator {

    private static final String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";

    public
    Boolean isValidEmail(String email)
        {
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        System.out.println("Email: " + email + " is " + (matcher.matches() ? "valid" : "invalid"));
        return matcher.matches();
        }

    public
    Boolean isValidPassword(String password)
        {
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        System.out.println("Password: " + password + " is " + (matcher.matches() ? "valid" : "invalid"));
        return matcher.matches();

        }
}
