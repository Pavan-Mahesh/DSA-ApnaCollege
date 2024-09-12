// 12-9-24

package Day008_Arrays;

public class SmallestAndLargest {
    static void showValues(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int elem: arr) {
            smallest = Math.min(smallest, elem);
            largest = Math.max(largest, elem);
        }

        System.out.println("min: " + smallest + "\nmax: " + largest);
    }

    static void showIndices(int[] arr) {
        int smallest = 0;
        int largest = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[smallest] > arr[i])
                smallest = i;
            else if(arr[largest] < arr[i])
                largest = i;
        }

        System.out.println("min: " + smallest + "\nmax: " + largest);
    }

    public static void main(String[] args) {
        int[] arr = {5, 15, 22, 1, -15, 24};
        showValues(arr);
        System.out.println();
        showIndices(arr);
    }
}
