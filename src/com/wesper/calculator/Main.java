package com.wesper.calculator;

public class Main {

    public static void main(String[] args) {
        System.out.println(Calculator.addition(1, 2));
        System.out.println(Calculator.addition(0, 2));
        System.out.println(Calculator.addition(5, 0));
        System.out.println(Calculator.addition(0, 0));
        System.out.println(Calculator.addition(-1, 1));
        System.out.println(Calculator.addition(-10, -10));
        System.out.println(Calculator.addition(-10, 3));

        System.out.println(Calculator.addition(-10.11, 3));
        System.out.println(Calculator.addition(4, 3.2));
        System.out.println(Calculator.addition(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(Calculator.subtraction(1, 2));
        System.out.println(Calculator.subtraction(2, 1));
        System.out.println(Calculator.subtraction(0, 2));
        System.out.println(Calculator.subtraction(5, 0));
        System.out.println(Calculator.subtraction(0, 0));
        System.out.println(Calculator.subtraction(-1, 1));
        System.out.println(Calculator.subtraction(-10, -10));
        System.out.println(Calculator.subtraction(-10, 3));

        System.out.println(Calculator.subtraction(-10.11, 3));
        System.out.println(Calculator.subtraction(4, 3.2));
        System.out.println(Calculator.subtraction(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(Calculator.division(2, 2));
        System.out.println(Calculator.division(2, 1));
        System.out.println(Calculator.division(1, 2));
        System.out.println(Calculator.division(0, 0));
        System.out.println(Calculator.division(-1, 3));
        System.out.println(Calculator.division(5, -7));
        System.out.println(Calculator.division(-10, -10));

        System.out.println(Calculator.division(-10.11, 3));
        System.out.println(Calculator.division(4, 3.2));
        System.out.println(Calculator.division(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(Calculator.multiplied(4, 2));
        System.out.println(Calculator.multiplied(3, 2));
        System.out.println(Calculator.multiplied(0, 2));
        System.out.println(Calculator.multiplied(5, 0));
        System.out.println(Calculator.multiplied(0, 0));
        System.out.println(Calculator.multiplied(-1, 2));
        System.out.println(Calculator.multiplied(-10, -10));
        System.out.println(Calculator.multiplied(-10, 3));

        System.out.println(Calculator.multiplied(-10.11, 3));
        System.out.println(Calculator.multiplied(4, 3.2));
        System.out.println(Calculator.multiplied(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(Calculator.sqrt(-1));
        System.out.println(Calculator.sqrt(0));
        System.out.println(Calculator.sqrt(4));
        System.out.println(Calculator.sqrt(320.0521));
        System.out.println(Calculator.sqrt(8835754));
        System.out.println();
//-------------
        System.out.println(Calculator.pow(0, 2));
        System.out.println(Calculator.pow(1, 0));
        System.out.println(Calculator.pow(2, 2));
        System.out.println(Calculator.pow(2, 1));
        System.out.println(Calculator.pow(2, 22));
        System.out.println(Calculator.pow(2, -1));
        System.out.println(Calculator.pow(2, -10));
        System.out.println(Calculator.pow(3.33, -4));
        System.out.println(Calculator.pow(3.33, 10));

    }
}
