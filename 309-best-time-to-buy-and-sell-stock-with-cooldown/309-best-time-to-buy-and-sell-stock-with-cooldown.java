class Solution {
    public int maxProfit(int[] prices) {
		int[][] dp = new int[prices.length][3];
        return calculateProfit(prices, dp, 0, 0); // state: 0 = buy, 1 = sell, 2 = cooldown
    }
	
	private int calculateProfit(int[] prices, int[][] dp, int index, int state) {
		if(index >= prices.length) return 0;
		
		if(dp[index][state] != 0) 
			return dp[index][state];
			
		int profit = 0;
		
		if(state == 0) { // we have to buy in this state (or skip to buy later)
			int buyNow = calculateProfit(prices, dp, index + 1, 1) - prices[index];
			int buyLater = calculateProfit(prices, dp, index + 1, state); // skipping today, so sending the same state for the next day
			
			profit = Math.max(buyNow, buyLater);	
		}
		else if(state == 1) { // we have to sell in this state (or skip to sell later)
			int sellNow = prices[index] + calculateProfit(prices, dp, index + 1, 2);
			int sellLater = calculateProfit(prices, dp, index + 1, state); // skipping today, so sending the same state for the next day
			
			profit = Math.max(sellNow, sellLater);
		}
		else if(state == 2) { // cooldown, we can buy stock the next day
			profit = calculateProfit(prices, dp, index + 1, 0);
		}
				
		return dp[index][state] = profit;
	}
}