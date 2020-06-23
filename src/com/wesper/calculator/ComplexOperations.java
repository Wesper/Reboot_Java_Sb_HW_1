package com.wesper.calculator;

public class ComplexOperations {

    public static double sqrt(int number) {
        double res = 1;
        double tmp = 0;

        if (number == 0) {
            return 0;
        }

        if (number < 0) {
            System.out.println("Нельзя извлевать квадратный корень из отрицательного числа");
            return 0;
        }

        do {
            tmp = res;
            res = ((number / res) + res) / 2;
        } while (res != tmp);

        return res;
    }

    public static double sqrt(double number) {
        double res = 1;
        double tmp = 0;

        if (number == 0) {
            return 0;
        }

        if (number < 0) {
            System.out.println("Нельзя извлевать квадратный корень из отрицательного числа");
            return 0;
        }

        do {
            tmp = res;
            res = ((number / res) + res) / 2;
        } while (res != tmp);

        return res;
    }

    public static double pow(int number, int power) {
        double res = 1;

        if (number == 0) {
            return 0;
        }

        if (power == 0) {
            return 1;
        }

        if (power > 0) {
            for (int i = 1; i <= power; i++) {
                res = res * number;
            }
        } else {
            for (int i = -1; i >= power; i--) {
                res = res * number;
            }
            res = 1 / res;
        }
        return res;
    }

    public static double pow(double number, int power) {
        double res = 1;

        if (number == 0) {
            return 0;
        }

        if (power == 0) {
            return 1;
        }

        if (power > 0) {
            for (int i = 1; i <= power; i++) {
                res = res * number;
            }
        } else {
            for (int i = -1; i >= power; i--) {
                res = res * number;
            }
            res = 1 / res;
        }
        return res;
    }
}
