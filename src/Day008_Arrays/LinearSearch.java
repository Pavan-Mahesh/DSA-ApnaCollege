// 12-9-24

package Day008_Arrays;

// time complexity of linear search is O(n)

public class LinearSearch {
    static int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 1, 2, 5};
        int target = 8;

        System.out.println("idx: " + search(arr, target));
    }
}
