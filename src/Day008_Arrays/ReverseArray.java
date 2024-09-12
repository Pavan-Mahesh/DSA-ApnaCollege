// 12-9-24

package Day008_Arrays;

import java.util.Arrays;

public class ReverseArray {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 1, 2, 5};

        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
