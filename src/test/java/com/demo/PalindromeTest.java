package com.demo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * PalindromeTest
 */
public class PalindromeTest {

  @Test
  public void testPalindrome() {
    assertTrue(Palindromes.isPalindrome("Kayak"));
    assertTrue(Palindromes.isPalindrome("abcba"));
    assertTrue(Palindromes.isPalindrome("175571"));
  }

  @Test
  public void testNoPalindrome() {
    assertFalse(Palindromes.isPalindrome("test"));
  }
}
