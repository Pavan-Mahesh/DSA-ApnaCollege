// 12-9-24

package Day008_Arrays;

public class SumAndProduct {
    static int sum(int[] arr) {
        int ans = 0;
        for(int elem: arr)
            ans += elem;

        return ans;
    }

    static int product(int[] arr) {
        int ans = 1;
        for(int elem: arr)
            ans *= elem;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 1, 2, 5};
        System.out.println("sum: " + sum(arr));
        System.out.println("product: " + product(arr));
    }
}
