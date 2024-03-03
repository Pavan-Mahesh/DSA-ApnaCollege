package com.Array;

public class MinAndMax {
    static int maxValue (int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int minValue (int[] arr) {
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 5, 2, 7, 13, 17, 8};
        ArrayUtil.print(myArray);
        System.out.println("max: " + maxValue(myArray));
        System.out.println("min: " + minValue(myArray));
    }
}
