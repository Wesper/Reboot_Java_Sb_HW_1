package com.wesper.refactoring;

public class EratosthenesAlgorithm implements AlgorithmApi {

    @Override
    public int[] algorithm(int maxNumber) {
        int[] finalArray;
        if( maxNumber >= 2) {
            int maxIndex = maxNumber + 1;
            boolean[] array = new boolean[maxIndex];
            array = prepareArray(array, true);
            array = eratosthenes(array);
            int count = countTrueElements(array);
            finalArray = new int[count];
            finalArray = createFinalArray(array, finalArray);
        } else {
            finalArray = new int[0];
        }

        return finalArray;
    }

    public boolean[] prepareArray(boolean[] array, boolean f) {
        int i;
        for (i = 0; i < array.length; i++)
            array[i] = true;
        array[0] = array[1] = false;
        return array;
    }

    public boolean[] eratosthenes(boolean[] array) {
        int i;
        int j;
        for (i = 2; i < Math.sqrt(array.length) + 1; i++) {
            if (array[i]) {
                for (j = 2 * i; j < array.length; j += i) {
                    array[j] = false;
                }
            }
        }
        return array;
    }

    public int countTrueElements(boolean[] array) {
        int count = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i])
                count++;
        }
        return count;
    }

    public int[] createFinalArray(boolean[] array, int[] finalArray) {
        int i;
        int j;
        for (i = 0, j = 0; i < array.length; i++) {
            if (array[i])
                finalArray[j++] = i;
        }

        return finalArray;
    }
}
