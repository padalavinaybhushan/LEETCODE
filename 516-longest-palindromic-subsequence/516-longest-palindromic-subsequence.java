class Solution {
    public static int solve(String str,String strb)
    {
        int m = str.length(),n=strb.length();
        int[][] dp  = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(str.charAt(i-1) == strb.charAt(j-1))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int longestPalindromeSubseq(String s) {
      String strb = (new StringBuilder(s)).reverse().toString();
        return solve(s,strb);
    }
}