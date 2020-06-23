package com.wesper.calculator;

public class BaseOperations {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Нельзя делить на ноль!");
            return 0;
        }
        return a / b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Нельзя делить на ноль!");
            return 0;
        }
        return a / b;
    }

    public static int multiplied(int a, int b) {
        return a * b;
    }

    public static double multiplied(double a, double b) {
        return a * b;
    }

}
