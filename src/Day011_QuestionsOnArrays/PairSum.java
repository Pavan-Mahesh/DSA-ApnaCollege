// 17-9-24

package Day011_QuestionsOnArrays;

import java.util.Arrays;

public class PairSum {
    // time complexity: O(n^2)
    static int[] bruteForceApproach(int[] numbs, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < numbs.length - 1; i++) {
            for(int j = i + 1; j < numbs.length; j++) {
                if(numbs[i] + numbs[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }

                if(numbs[i] + numbs[j] > target)
                    break;
            }
        }

        return ans;
    }

    // 2-pointer approach
    // time complexity: O(n)
    static int[] optimalApproach(int[] numbs, int target) {
        int[] ans = new int[2];

        int i = 0, j = numbs.length - 1;
        while(i < j) {
            int ps = numbs[i] + numbs[j];
            if (ps > target) {
                j--;
            } else if(ps < target) {
                i++;
            } else {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] numbs = {2, 7, 11, 15};

        System.out.println("pair: " + Arrays.toString(bruteForceApproach(numbs, 22)));
        System.out.println("pair: " + Arrays.toString(optimalApproach(numbs, 22)));
    }
}
