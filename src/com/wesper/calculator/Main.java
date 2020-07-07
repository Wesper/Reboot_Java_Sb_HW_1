package com.wesper.calculator;

public class Main {

    public static void main(String[] args) {
        BaseOperationsImpl baseOperations = new BaseOperationsImpl();
        System.out.println(baseOperations.addition(1, 2));
        System.out.println(baseOperations.addition(0, 2));
        System.out.println(baseOperations.addition(5, 0));
        System.out.println(baseOperations.addition(0, 0));
        System.out.println(baseOperations.addition(-1, 1));
        System.out.println(baseOperations.addition(-10, -10));
        System.out.println(baseOperations.addition(-10, 3));

        System.out.println(baseOperations.addition(-10.11, 3));
        System.out.println(baseOperations.addition(4, 3.2));
        System.out.println(baseOperations.addition(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(baseOperations.subtraction(1, 2));
        System.out.println(baseOperations.subtraction(2, 1));
        System.out.println(baseOperations.subtraction(0, 2));
        System.out.println(baseOperations.subtraction(5, 0));
        System.out.println(baseOperations.subtraction(0, 0));
        System.out.println(baseOperations.subtraction(-1, 1));
        System.out.println(baseOperations.subtraction(-10, -10));
        System.out.println(baseOperations.subtraction(-10, 3));

        System.out.println(baseOperations.subtraction(-10.11, 3));
        System.out.println(baseOperations.subtraction(4, 3.2));
        System.out.println(baseOperations.subtraction(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(baseOperations.division(2, 2));
        System.out.println(baseOperations.division(2, 1));
        System.out.println(baseOperations.division(1, 2));
        System.out.println(baseOperations.division(0, 0));
        System.out.println(baseOperations.division(-1, 3));
        System.out.println(baseOperations.division(5, -7));
        System.out.println(baseOperations.division(-10, -10));

        System.out.println(baseOperations.division(-10.11, 3));
        System.out.println(baseOperations.division(4, 3.2));
        System.out.println(baseOperations.division(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(baseOperations.multiplied(4, 2));
        System.out.println(baseOperations.multiplied(3, 2));
        System.out.println(baseOperations.multiplied(0, 2));
        System.out.println(baseOperations.multiplied(5, 0));
        System.out.println(baseOperations.multiplied(0, 0));
        System.out.println(baseOperations.multiplied(-1, 2));
        System.out.println(baseOperations.multiplied(-10, -10));
        System.out.println(baseOperations.multiplied(-10, 3));

        System.out.println(baseOperations.multiplied(-10.11, 3));
        System.out.println(baseOperations.multiplied(4, 3.2));
        System.out.println(baseOperations.multiplied(1.1, 2.9));
        System.out.println();
//-------------
        ComplexOperationsImpl complexOperations = new ComplexOperationsImpl();
        System.out.println(complexOperations.sqrt(-1));
        System.out.println(complexOperations.sqrt(0));
        System.out.println(complexOperations.sqrt(4));
        System.out.println(complexOperations.sqrt(320.0521));
        System.out.println(complexOperations.sqrt(8835754));
        System.out.println();
//-------------
        System.out.println(complexOperations.pow(0, 2));
        System.out.println(complexOperations.pow(1, 0));
        System.out.println(complexOperations.pow(2, 2));
        System.out.println(complexOperations.pow(2, 1));
        System.out.println(complexOperations.pow(2, 22));
        System.out.println(complexOperations.pow(2, -1));
        System.out.println(complexOperations.pow(2, -10));
        System.out.println(complexOperations.pow(3.33, -4));
        System.out.println(complexOperations.pow(3.33, 10));
//-------------
        CalculateRpnExpressionImpl calculateRpnExpressionImpl = new CalculateRpnExpressionImpl();
        String rslt;
        String str = "- 234 + 3 + ( - 21 - 2  ) * -21 - - 1 +-0";
        System.out.println(str + " = " + calculateRpnExpressionImpl.evaluateExpression(str));
        String str1 = "(6+10-4)/(1+1*2)+1";
        System.out.println(str1 + " = " + calculateRpnExpressionImpl.evaluateExpression(str1));
        String str2 = "((4/2)+1)";
        System.out.println(str2 + " = " + calculateRpnExpressionImpl.evaluateExpression(str2));
        String str3 = "(4/(2-1))+1";
        System.out.println(str3 + " = " + calculateRpnExpressionImpl.evaluateExpression(str3));
        String str4 = "-((4/(2-1))+1)";
        System.out.println(str4 + " = " + calculateRpnExpressionImpl.evaluateExpression(str4));
        String str5 = "-(-(4/(2-1))+1)";
        System.out.println(str5 + " = " + calculateRpnExpressionImpl.evaluateExpression(str5));
        String str6 = "-(1 - (4/(2-1))+1)";
        System.out.println(str6 + " = " + calculateRpnExpressionImpl.evaluateExpression(str6));

    }
}