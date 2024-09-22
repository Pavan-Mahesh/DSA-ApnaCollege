// 12-9-24

package Day008_Arrays;

public class Intersection {
    static void printIntersection(int[] a, int[] b) {
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

    public static void main(String[] args) {
        int[] a = {9, 5, 6, 0, 4, 1};
        int[] b = {8, 0, 3, 5, 4, 7};

        printIntersection(a, b);
    }
}
