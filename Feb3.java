// GFG 3-Feb Problem: Stock Buy and Sell

public class Feb3 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Feb3 feb3 = new Feb3();

        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = feb3.maxProfit(prices);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
