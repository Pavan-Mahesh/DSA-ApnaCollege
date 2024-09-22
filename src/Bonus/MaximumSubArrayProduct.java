// 21-9-24
// by Prem sir - CRT last day

package Bonus;

public class MaximumSubArrayProduct {
    static int findMaxProduct(int[] numbs) {
        int currProd = 1;
        int maxProd = 1;
        for(int i = 0; i < numbs.length; i++) {
            currProd *= numbs[i];
            maxProd = Math.max(currProd, maxProd);
            if(currProd == 0)
                currProd = 1;
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] numbs = {3, 1, -4, 0, 5, -3, 0, -3};
        System.out.println(findMaxProduct(numbs));
    }
}
