class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=1;i<n;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]+j >= i)
                {
                    if(dp[j] != Integer.MAX_VALUE)
                    {
                        dp[i] = Math.min(dp[i],dp[j]+1);
                    }
                }
            }
        }
        return !(dp[n-1] == Integer.MAX_VALUE);
    }
}