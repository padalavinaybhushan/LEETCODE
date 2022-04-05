class Solution {
    public static int fun(int[] prices,int inde ,int statee,int cape,int[][][] dp)
    {
        // if(cape == 0) return 0;
        // if(inde == prices.length ) return 0;
        for(int ind =prices.length-1;ind>=0;ind--){
            for(int state=0;state<=1;state++){
                for(int cap= 2;cap>0;cap--)
                {
                    if(state == 0)
                    {
                         int op1 = -1*prices[ind] + dp[ind+1][1][cap];
                            int op2 =  dp[ind+1][state][cap];
                           dp[ind][state][cap] = Math.max(op1,op2);
                    }
                    else
                    {
                        int op1 = prices[ind] +  dp[ind+1][0][cap-1];
                        int op2 = dp[ind+1][state][cap];
                         dp[ind][state][cap] = Math.max(op1,op2);
                    }
                }
            }
        }
        return dp[0][0][2];
    }
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length+1][2][3];
        return fun(prices,0,0,2,dp);
    }
}