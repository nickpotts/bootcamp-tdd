package com.fuse.bootcamp.tdd.string;

public interface IString {
    String concat(String str1, String str2);

    String reverse(String str);

    String toUpperCase(String str);

    String toLowerCase(String str);

    boolean isPalindrome(String str);
}
