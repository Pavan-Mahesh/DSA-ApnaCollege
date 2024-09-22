// 16-9-24

package Day010_QuestionsOnArrays;

public class MaximumSubArraySum {
    static int bruteForceApproach(int[] numbs) {
        int maxSum = Integer.MIN_VALUE;
        for (int st = 0; st < numbs.length; st++) {
            for (int ed = st; ed < numbs.length; ed++) {
                int sum = 0;
                for (int i = st; i <= ed; i++)
                    sum += numbs[i];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    static int betterApproach(int[] numbs) {
        int maxSum = Integer.MIN_VALUE;
        for(int st = 0; st < numbs.length; st++) {
            int currSum = 0;
            for(int ed = st; ed < numbs.length; ed++) {
                currSum += numbs[ed];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }

    static int optimalApproach(int[] numbs) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int j : numbs) {
            currSum += j;
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }

    static void printAnySubArrayOfMaximumSum(int[] numbs) {
        int st = 0, arr_st = 0, arr_ed = 0;
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbs.length; i++) {
            if (currSum == 0)
                st = i;

            currSum += numbs[i];
            if (currSum > maxSum) {
                maxSum = currSum;
                arr_st = st;
                arr_ed = i;
            }

            if(currSum < 0)
                currSum = 0;
        }

        for(int i = arr_st; i <= arr_ed; i++)
            System.out.print(numbs[i] + " ");
    }

    public static void main(String[] args) {
        int[] numbs = {3, -4, 5, 4, -1, 7, -8};
        System.out.println("max sub-array sum: " + bruteForceApproach(numbs));
        System.out.println("max sub-array sum: " + betterApproach(numbs));
        System.out.println("max sub-array sum: " + optimalApproach(numbs));
        printAnySubArrayOfMaximumSum(numbs);
    }
}
