class Solution {
    public int[] sumZero(int n) {
        if(n%2 == 0)
        {
            int[] ans = new int[n];
            int start = n/2;
            for(int i=0;i<n/2;i++)
            {
                ans[i] = start;
                ans[i+n/2] = -1*start;
                start--;
            }
            return ans;
        }
        else
        {
            int[] ans = new int[n];
            int start = n/2;
            for(int i=0;i<(n/2);i++)
            {
                ans[i]= start;
                ans[n-i-1] = -1*start;
                start--;
            }
            ans[n/2]=0;
            return ans;
        }
    }
}