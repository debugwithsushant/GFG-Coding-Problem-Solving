// GFG160 Day10 Problem: Stock Buy and Sell – Max one Transaction Allowed

public class Day10 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        Day10 solution = new Day10();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
