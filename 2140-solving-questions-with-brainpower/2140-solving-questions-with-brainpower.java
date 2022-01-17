class Solution {
    public long mostPoints(int[][] questions) {
        int len = questions.length;
        long[] dp = new long[len];
        for(int i=len-1;i>=0;i--)
        {
            int futureindex= i+questions[i][1]+1;
            if(futureindex>len-1)
            {
                dp[i] = questions[i][0];
            }
            else
            {
                dp[i] = questions[i][0]+dp[futureindex];
            }
            if(i<len-1)
            {
                dp[i] = Math.max(dp[i+1],dp[i]);
            }
        }
        return dp[0];
        
    }
}