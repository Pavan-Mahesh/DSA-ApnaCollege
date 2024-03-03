package com.Array;

public class MoveZeroesToEnd {
    static void moveZeroesToEnd (int[] arr) {
        int x = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[x] == 0 && arr[i] != 0) {
                int temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
            if(arr[x] != 0)
                x++;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {17, 0, 0, 9, 0, 20, 0};
        ArrayUtil.print(myArray);
        moveZeroesToEnd(myArray);
        ArrayUtil.print(myArray);
    }
}
