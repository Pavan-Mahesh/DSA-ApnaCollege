package Day008_Arrays;

import java.util.Arrays;

public class SwapMaxAndMin {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swapMaxMin(int[] arr) {
        int min = 0;
        int max = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[min] > arr[i])
                min = i;
            else if(arr[max] < arr[i])
                max = i;
        }

        swap(arr, min, max);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 6, 1};
        swapMaxMin(arr);
        System.out.println(Arrays.toString(arr));
    }
}
