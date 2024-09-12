// 12-9-24

package Day008_Arrays;

import java.util.Arrays;

public class Intersection {
    // preserve order
    static void printIntersection1(int[] a, int[] b) {
        for(int i : a) {
            for (int j : b) {
                if(i == j) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    // changing order
    static void printIntersection2(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length) {
            if(a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if(a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {9, 5, 6, 0, 4, 1};
        int[] b = {8, 0, 3, 5, 4, 7};

        System.out.print("preserve order: ");
        printIntersection1(a, b);

        System.out.print("change order: ");
        printIntersection2(a, b);
    }
}
