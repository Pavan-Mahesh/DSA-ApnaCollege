// 12-9-24

package Day008_Arrays;

public class UniqueElem {
    static void printUnique(int[] arr) {
        boolean[] seen = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(seen[i])
                continue;

            boolean unique = true;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    seen[j] = true;
                    if(unique) unique = false;
                }
            }

            if(unique)
                System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 0, 6, 8, 0, 1 ,8, 9, 2};

        printUnique(arr);
    }
}
