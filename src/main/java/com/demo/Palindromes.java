package com.demo;

/**
 * Palindromes
 */
public class Palindromes {
  public static boolean isPalindrome(String str) {
    str = str.replaceAll(" ", "").toLowerCase();
    String reverse = new StringBuilder(str).reverse().toString();

    return str.equals(reverse);
  }
}
