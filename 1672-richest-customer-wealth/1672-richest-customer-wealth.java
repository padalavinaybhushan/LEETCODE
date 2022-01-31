class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i=0;i<m;i++)
        {
            int tem=0;
            for(int j=0;j<n;j++)
            {
                tem += (accounts[i][j]);
            }
            ans = Math.max(ans,tem);
        }
        return ans;
    }
}