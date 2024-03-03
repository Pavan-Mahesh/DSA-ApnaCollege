package com.Array;

public class ResizeArray {
    int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++)
            temp[i] = arr[i];
        return temp;
    }

    void demo() {
        int[] myArray = {10, 5, 2, 7};
        System.out.println("Original: " + myArray.length);
        myArray = resizeArray(myArray, myArray.length * 2);
        System.out.println("Resized: " + myArray.length);
    }
    public static void main(String[] args) {
        ResizeArray obj = new ResizeArray();
        obj.demo();
    }
}
