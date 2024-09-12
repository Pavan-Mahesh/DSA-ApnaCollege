// 12-9-24

package Day008_Arrays;

import java.util.Arrays;

public class UniqueValues {
    // preserve order
    static void printUnique1(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate)
                System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // changing order
    static void printUnique2(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(i == 0 || arr[i] != arr[i - 1])
                System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 5, 9, 6, 6, 0, 4, 1, 1};

        System.out.print("preserve order: ");
        printUnique1(arr);

        System.out.print("change order: ");
        printUnique2(arr);
    }
}
