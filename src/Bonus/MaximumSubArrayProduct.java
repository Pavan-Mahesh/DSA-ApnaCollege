// 21-9-24
// by Prem sir - CRT last day

package Bonus;

public class MaximumSubArrayProduct {
    static int bruteForceApproach(int[] numbs) {
        int maxProd = Integer.MIN_VALUE;
        for(int i = 0; i < numbs.length; i++) {
            int currProd = 1;
            for(int j = i; j < numbs.length; j++) {
                currProd *= numbs[j];
                maxProd = Math.max(currProd, maxProd);
            }
        }

        return maxProd;
    }

    static int optimalApproach(int[] numbs) {
        int maxProd = Integer.MIN_VALUE;
        int prefixProd = 1;
        int suffixProd = 1;
        for(int i = 0; i < numbs.length; i++) {
            prefixProd *= numbs[i];
            suffixProd *= numbs[numbs.length - 1 - i];
            maxProd = Math.max(maxProd, Math.max(prefixProd, suffixProd));
            if(prefixProd == 0) prefixProd = 1;
            if(suffixProd == 0) suffixProd = 1;
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] numbs = {3, 2, -1, 4, 0, 3, -2, 7};
        System.out.println(bruteForceApproach(numbs));
        System.out.println(optimalApproach(numbs));
    }
}
