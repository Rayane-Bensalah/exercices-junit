package com.demo;

import java.util.ArrayList;

public class Calculatrice {

  public static int additionner(int a, int b) { return a + b; }

  public static int soustraire(int a, int b) { return a - b; }

  public static int multiplier(int a, int b) { return a * b; }

  public static int max(int a, int b) { return a > b ? a : b; }

  public static double diviser(double a, double b) { return a / b; }

  public static double diviserInteger(int a, int b) { return a / b; }

  public static ArrayList<Integer> getImpairs(int max) {
    ArrayList<Integer> res = new ArrayList<>();

    for (int count = 0; count < max; count++) {
      if (count % 2 == 1) {
        res.add(count);
      }
    }
    return res;
  }
}
