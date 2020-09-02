package com.demo.payment.utility;

import java.util.Random;

public class AuthorizationCodeGenerator {
    public static String generateCode() {
        String values = CacheConstants.CAPITAL_CHARS + CacheConstants.SMALL_CHARS + CacheConstants.NUMBERS;
        // Using random method
        Random rndm_method = new Random();
        char[] password = new char[12];
        for (int i = 0; i < 12; i++) {
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        }
        return password.toString();
    }
}
