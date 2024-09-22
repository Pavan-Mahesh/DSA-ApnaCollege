// 22-9-24

package Day013_LeetCodeQuestions;

public class BestBuyAndSell {
    static int maxProfit(int[] prices) {
        int max = 0;
        int bestBuy = prices[0];
        for(int i = 1; i < prices.length; i++) {
            int profit = prices[i] - bestBuy;
            max = Math.max(profit, max);
            bestBuy = Math.min(prices[i], bestBuy);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}
