package com.wesper.refactoring;

public class Generate {
    AlgorithmApi algorithmApi;
    PrintApi printApi;

    public void setAlgorithmApi(AlgorithmApi algorithmApi) {
        this.algorithmApi = algorithmApi;
    }

    public void setPrintApi(PrintApi printApi) {
        this.printApi = printApi;
    }

    public void generate(int maxNumber, int symbolsInRow, int rows) {
        int[] array = algorithmApi.algorithm(maxNumber);
        printApi.print(symbolsInRow, rows, array);
    }
}
