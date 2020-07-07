package com.wesper.calculator;

public class BaseOperationsImpl implements BaseOperationsApi{

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public int division(int a, int b) {
        if (b == 0) {
            System.out.println("Нельзя делить на ноль!");
            return 0;
        }
        return a / b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Нельзя делить на ноль!");
            return 0;
        }
        return a / b;
    }

    @Override
    public int multiplied(int a, int b) {
        return a * b;
    }

    @Override
    public double multiplied(double a, double b) {
        return a * b;
    }

}
