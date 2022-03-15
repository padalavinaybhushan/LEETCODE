class Solution {
    public int change(int amt, int[] coins) {
         int n = coins.length;
        int[][] dp = new int[amt+1][n+1];
        for(int i=0;i<=n;i++)
        {
            dp[0][i] = 1;
        }
        for(int i=1;i<=amt;i++)
        {
            dp[i][0] = 0;
        }
        for(int i=1;i<=amt;i++)
        {
            for(int j=1;j<=n;j++)
            {
                dp[i][j] = dp[i][j-1];
                if(coins[j-1] <= i)
                {
                    dp[i][j] += dp[i-coins[j-1]][j];
                }
            }
        }
        return dp[amt][n];
        
    }
}