package com.demo;

public class Calculatrice {

    public static int additionner(int a, int b){
        return a + b;
    }

    public static int soustraire(int a, int b){
        return a - b;
    }

    public static int multiplier(int a, int b) {
        return a * b;
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static double diviser(double a, double b){
        return a / b;
    }

    public static double diviserInteger(int a, int b){
        return a / b;
    }
}
