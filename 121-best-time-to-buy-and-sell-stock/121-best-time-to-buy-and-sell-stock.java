class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int[] arr = new int[len];
        
        int max = prices[len-1];
        for(int i=len-1;i>=0;i--)
        {
            if(i == len-1)
            {
                max = prices[i];
                arr[i] = max;
            }
            else
            {
                arr[i] = Math.max(max,prices[i]);
                max = arr[i];
            }
        }
        int ans = arr[0]-prices[0];
        for(int i=0;i<len;i++)
        {
            ans = Math.max(arr[i]-prices[i],ans);
        }
        return ans;
    }
}