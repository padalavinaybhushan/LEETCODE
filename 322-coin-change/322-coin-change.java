class Solution {
    public int coinChange(int[] coins, int amt) {
      int[] dp = new int[amt+1];
        dp[0] = 0;
        int n = coins.length;
        for(int i=1;i<=amt;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=1;i<=amt;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(coins[j]<=i)
                {
                    int sub = dp[i-coins[j]];
                    if(sub != Integer.MAX_VALUE)
                    {
                        dp[i] = Math.min(dp[i],sub+1);
                    }
                }
            }
        }
        return (dp[amt] == Integer.MAX_VALUE)?-1:dp[amt];
    }
}