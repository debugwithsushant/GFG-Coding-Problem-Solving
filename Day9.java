// GFG160 Day9 Problem: Stock Buy and Sell – Multiple Transaction Allowed

public class Day9 {
    public int maxProfit(int prices[]) {
        int totalProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                totalProfit += prices[i] - prices[i-1];
            }
        }
        
        return totalProfit;
    }

    public static void main(String[] args) {
        Day9 solution = new Day9();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
