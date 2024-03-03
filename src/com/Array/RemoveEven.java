package com.Array;

public class RemoveEven {
    static int[] eliminateEvens (int[] arr) {
        int oddCount = 0;
        for (int i : arr)
            if(i%2 != 0)
                oddCount++;
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i : arr)
            if (i % 2 != 0)
                result[idx++] = i;
        return result;
    }

    public static void main (String[] args) {
        int[] myArray = {10, 5, 2, 7, 13, 17, 8};
        ArrayUtil.print(myArray);
        myArray = eliminateEvens(myArray);
        ArrayUtil.print(myArray);
    }
}
