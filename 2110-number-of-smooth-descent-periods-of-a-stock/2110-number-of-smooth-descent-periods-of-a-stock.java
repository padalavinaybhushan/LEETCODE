class Solution {
    public long getDescentPeriods(int[] prices) {
        int len = prices.length;
        if(len ==1)
        {
            return 1;
        }
        int curr=1;
        int i=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for( i=1;i<len;i++)
        {
            if(i ==len-1)
            {
                if(prices[i-1] - prices[i] == 1)
                {
                    arr.add(curr+1);
                }
                else
                {
                    arr.add(curr);
                    arr.add(1);
                }
            }
            else{
                if(prices[i-1]-prices[i] == 1)
            {
                curr++;
            }
            else
            {
                arr.add(curr);
                curr=1;
            }
            }
            
        }
        long ans = 0;
        // System.out.println(arr);
        for(int j: arr)
        {
            ans += ((long)j*(j+1)/2);
        }
       
        return ans;
    }
}