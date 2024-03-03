package com.Array;

public class ReverseArray {
    static void reversing (int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {10, 5, 2, 7, 13, 17, 8};
        ArrayUtil.print(myArray);
        reversing(myArray, 0, myArray.length-1);
        ArrayUtil.print(myArray);
    }
}
