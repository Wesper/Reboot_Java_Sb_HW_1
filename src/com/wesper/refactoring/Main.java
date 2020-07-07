package com.wesper.refactoring;

public class Main {

    public static void main(String[] args) {
        Generate generate = new Generate();
        generate.setAlgorithmApi(new EratosthenesAlgorithm());
        generate.setPrintApi(new PrintImpl());
        generate.generate(1000000, 100, 3);
    }
}
