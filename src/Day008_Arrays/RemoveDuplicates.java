// 12-9-24

package Day008_Arrays;

public class RemoveDuplicates {
    static void printNonDuple(int[] arr) {
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

    public static void main(String[] args) {
        int[] arr = {9, 9, 5, 9, 6, 6, 0, 4, 1, 1};

        printNonDuple(arr);
    }
}
