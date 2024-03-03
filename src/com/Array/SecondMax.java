package com.Array;

public class SecondMax {
    static int secondMaxValue (int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 5, 2, 7, 13, 17, 8};
        ArrayUtil.print(myArray);
        System.out.println("second max: " + secondMaxValue(myArray));
    }
}
