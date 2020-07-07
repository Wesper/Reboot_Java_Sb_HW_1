package com.wesper.refactoring;

public class PrintImpl implements PrintApi {

    @Override
    public void print(int maxSymbolsInRow, int maxRows, int[] arr) {
        int symbolCounter = 0;
        int rowCounter = 0;
        for (int a : arr) {
            System.out.print(a + " ");
            symbolCounter += String.valueOf(a).length() + 1;
            if (symbolCounter >= maxSymbolsInRow) {
                System.out.println();
                symbolCounter = 0;
                rowCounter++;
            }
            if (rowCounter >= maxRows) {
                System.out.println("--------Новая cтраница--------");
                rowCounter = 0;
            }
        }
    }
}
