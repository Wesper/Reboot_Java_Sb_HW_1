package com.wesper.calculator;

public class Main {

    public static void main(String[] args) {
/*        System.out.println(BaseOperations.addition(1, 2));
        System.out.println(BaseOperations.addition(0, 2));
        System.out.println(BaseOperations.addition(5, 0));
        System.out.println(BaseOperations.addition(0, 0));
        System.out.println(BaseOperations.addition(-1, 1));
        System.out.println(BaseOperations.addition(-10, -10));
        System.out.println(BaseOperations.addition(-10, 3));

        System.out.println(BaseOperations.addition(-10.11, 3));
        System.out.println(BaseOperations.addition(4, 3.2));
        System.out.println(BaseOperations.addition(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(BaseOperations.subtraction(1, 2));
        System.out.println(BaseOperations.subtraction(2, 1));
        System.out.println(BaseOperations.subtraction(0, 2));
        System.out.println(BaseOperations.subtraction(5, 0));
        System.out.println(BaseOperations.subtraction(0, 0));
        System.out.println(BaseOperations.subtraction(-1, 1));
        System.out.println(BaseOperations.subtraction(-10, -10));
        System.out.println(BaseOperations.subtraction(-10, 3));

        System.out.println(BaseOperations.subtraction(-10.11, 3));
        System.out.println(BaseOperations.subtraction(4, 3.2));
        System.out.println(BaseOperations.subtraction(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(BaseOperations.division(2, 2));
        System.out.println(BaseOperations.division(2, 1));
        System.out.println(BaseOperations.division(1, 2));
        System.out.println(BaseOperations.division(0, 0));
        System.out.println(BaseOperations.division(-1, 3));
        System.out.println(BaseOperations.division(5, -7));
        System.out.println(BaseOperations.division(-10, -10));

        System.out.println(BaseOperations.division(-10.11, 3));
        System.out.println(BaseOperations.division(4, 3.2));
        System.out.println(BaseOperations.division(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(BaseOperations.multiplied(4, 2));
        System.out.println(BaseOperations.multiplied(3, 2));
        System.out.println(BaseOperations.multiplied(0, 2));
        System.out.println(BaseOperations.multiplied(5, 0));
        System.out.println(BaseOperations.multiplied(0, 0));
        System.out.println(BaseOperations.multiplied(-1, 2));
        System.out.println(BaseOperations.multiplied(-10, -10));
        System.out.println(BaseOperations.multiplied(-10, 3));

        System.out.println(BaseOperations.multiplied(-10.11, 3));
        System.out.println(BaseOperations.multiplied(4, 3.2));
        System.out.println(BaseOperations.multiplied(1.1, 2.9));
        System.out.println();
//-------------
        System.out.println(ComplexOperations.sqrt(-1));
        System.out.println(ComplexOperations.sqrt(0));
        System.out.println(ComplexOperations.sqrt(4));
        System.out.println(ComplexOperations.sqrt(320.0521));
        System.out.println(ComplexOperations.sqrt(8835754));
        System.out.println();
//-------------
        System.out.println(ComplexOperations.pow(0, 2));
        System.out.println(ComplexOperations.pow(1, 0));
        System.out.println(ComplexOperations.pow(2, 2));
        System.out.println(ComplexOperations.pow(2, 1));
        System.out.println(ComplexOperations.pow(2, 22));
        System.out.println(ComplexOperations.pow(2, -1));
        System.out.println(ComplexOperations.pow(2, -10));
        System.out.println(ComplexOperations.pow(3.33, -4));
        System.out.println(ComplexOperations.pow(3.33, 10));*/


        String str = "- 234 + 3 + ( - 21 - 2  ) * -21 - - 1 +-0";
        CalculateRpnExpression calculateRpnExpression = new CalculateRpnExpression();
//        String str = "(6+10-4)/(1+1*2)+1";
        String rslt;
        rslt = calculateRpnExpression.evaluateExpression(str);
        System.out.println(rslt);
    }
}
