package com.fuse.bootcamp.tdd.string;

public class BCString implements IString {

    @Override
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    @Override
    public String reverse(String str) {
        String reversed;

        reversed = new StringBuilder(str).reverse().toString();

        return reversed;
    }

    @Override
    public String toUpperCase(String str) {
        String upperCase;

        upperCase = str.toUpperCase();


        return upperCase;
    }

    @Override
    public String toLowerCase(String str) {
        String lowerCase;

        lowerCase = str.toLowerCase();


        return lowerCase;
    }

    @Override
    public boolean isPalindrome(String str) {
        String reversed;

        reversed = new StringBuilder(str).reverse().toString();

        if ( reversed.equals(str)) {
            return true;
        }

        return false;
    }
}