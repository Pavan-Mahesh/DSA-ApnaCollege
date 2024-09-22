// 17-9-24

package Day011_QuestionsOnArrays;

import java.util.Arrays;

public class MajorityElement {
    // time complexity: O(n^2)
    static int bruteForceApproach(int[] numbs) {
        for(int i = 0; i < numbs.length; i++) {
            int count = 0;
            for(int j = 0; j < numbs.length; j++)
                if(numbs[j] == numbs[i])
                    count++;

            if(count > numbs.length / 2)
                return numbs[i];
        }

        return -1;
    }

    // using sorting approach
    // time complexity: O(n log(n))
    static int betterApproach(int[] numbs) {
        Arrays.sort(numbs);
        int freq = 1, ans = numbs[0];
        for(int i = 1; i < numbs.length; i++) {
            if(numbs[i] == numbs[i - 1]) {
                freq++;
                if(freq > numbs.length / 2)
                    return ans;
            } else {
                freq = 1;
                ans = numbs[i];
            }
        }

        freq = 0;
        for(int i = 0; i < numbs.length; i++)
            if(numbs[i] == ans)
                freq++;

        if(freq > numbs.length / 2)
            return ans;
        else
            return -1;
    }

    // moore's voting algorithm
    // time complexity: O(n)
    static int optimalApproach(int[] numbs) {
        int freq = 0, ans = -1;
        for(int i = 0; i < numbs.length; i++) {
            if(freq == 0)
                ans = numbs[i];

            if(ans == numbs[i])
                freq++;
            else
                freq--;
        }

        freq = 0;
        for(int i = 0; i < numbs.length; i++)
            if(numbs[i] == ans)
                freq++;

        if(freq > numbs.length / 2)
            return ans;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] numbs = {1, 2, 1, 2, 1};
        System.out.println("majority elem: " + bruteForceApproach(numbs));
        System.out.println("majority elem: " + betterApproach(numbs));
        System.out.println("majority elem: " + optimalApproach(numbs));
    }
}
