package com.wesper.array;

public class Array {

    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public void addElem(int elem) {
        int[] newArr = copyArrayRange(this.arr, 0, arr.length + 1);
        newArr[newArr.length - 1] = elem;
        this.arr = newArr;
    }

    public void addElem(int elem, int position) {
        int j = 0;
        int[] newArr = new int[this.arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i != position) {
                newArr[i] = arr[j];
                j++;
            } else {
                newArr[i] = elem;
            }
        }
        this.arr = newArr;
    }

    public void printLength() {
        System.out.println(this.arr.length);
    }

    public void deleteElem(int position) {
        int j = 0;
        int[] newArr = new int[this.arr.length - 1];
        for (int i = 0; i < this.arr.length && j < newArr.length; i++) {
            if (i != position) {
                newArr[j] = this.arr[i];
                j++;
            } else continue;
        }
        this.arr = newArr;
    }

    public void editElem(int elem, int position) {
        this.arr[position] = elem;
    }

    public void printArray() {
        for (int el : this.arr) {
            System.out.print(el + " ");
        }
    }

    public int maxElem() {
        int max = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if (max < this.arr[i]) {
                max = this.arr[i];
            }
        }
        return max;
    }

    public int minElem() {
        int min = this.arr[0];
        for (int i = 1; i < this.arr.length; i++) {
            if (min > this.arr[i]) {
                min = this.arr[i];
            }
        }
        return min;
    }

    public void fillArray(int elem) {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = elem;
        }
    }

    public int[] sortAscending() {
        int tmp, min;
        int[] newArr = copyArray(this.arr);
        for (int i = 0; i < newArr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[j] < newArr[min]) {
                    min = j;
                }
            }
            tmp = newArr[min];
            newArr[min] = newArr[i];
            newArr[i] = tmp;
        }
        return newArr;
    }

    public int[] sortDescending() {
        int tmp, max;
        int[] newArr = copyArray(this.arr);
        for (int i = 0; i < newArr.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[j] > newArr[max]) {
                    max = j;
                }
            }
            tmp = newArr[max];
            newArr[max] = newArr[i];
            newArr[i] = tmp;
        }
        return newArr;
    }

    public int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public int[] copyArrayRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        for (int i = from; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}