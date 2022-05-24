class Solution {
    public int longestValidParentheses(String s) {
        int l=s.length();
        if(l==0)
            return 0;
        int dp[] = new int[l];
        dp[0]=0;
        int m=0;
        for(int i=1;i<dp.length;i++){
            if(s.charAt(i)=='(')
            {
                continue;
            }
            else{
                dp[i]+=(i>dp[i-1] && s.charAt(i-dp[i-1]-1)=='(')?dp[i-1]+2:0; 
                dp[i]+=(i>dp[i])?dp[i-dp[i]]:0;
                m=Math.max(dp[i],m);
            }
        }
        return m;
    }
}