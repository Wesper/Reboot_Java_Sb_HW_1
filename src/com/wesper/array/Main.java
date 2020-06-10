package com.wesper.array;

public class Main {

    public static void main(String[] args) {
        int[] expl = {9, 6, 3, 0, 2, 4, 8, 1, 5, 7};
        Array array = new Array(expl);

        array.addElem(111);
        array.addElem(222, 2);
        array.printLength();
        array.deleteElem(10);
        array.editElem(66, 1);
        array.printArray();
        System.out.println();
        System.out.println("Максимальный элемент " + array.maxElem());
        System.out.println("Минимальный элемент " + array.minElem());
        int[] sortedAsc = array.sortAscending();
        int[] sortedDesc = array.sortDescending();
        array.fillArray(1);
        System.out.println();
    }
}
