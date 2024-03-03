// Given an arry of n-1 distinct numbers in the range of 1 to n.
// Find the missing number.

package com.Array;

public class FindMissingNum {
    int findMissingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for(int i: arr)
            sum -= i;
        return sum;
    }
    void demo() {
        int[] myArray = {1, 5, 2, 7, 4, 8, 6};
        ArrayUtil.print(myArray);
        System.out.println("Missing: " + findMissingNum(myArray));
    }

    public static void main(String[] args) {
        FindMissingNum obj = new FindMissingNum();
        obj.demo();
    }
}
