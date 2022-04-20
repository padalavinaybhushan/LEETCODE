class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        int[] suf = new int[len];
        pre[len-1] = nums[len-1];
        suf[0] = nums[0];
        int ind = len-1;
        for(int i=1;i<len;i++)
        {
            suf[i] = nums[i] * suf[i-1];
            pre[ind-i] = nums[ind-i] * pre[ind-i+1];
        }
        //System.out.println(Arrays.toString(suf) +" DF "+Arrays.toString(pre));
        int[] ans = new int[len];
        for(int i=0;i<len;i++)
        {
            if(i==0)
            {
                ans[0] = pre[1];
            }
            else if(i==len-1)
            {
                ans[i] = suf[i-1];
            }
            else
            {
                ans[i] = pre[i+1]*suf[i-1];
            }
        }
        return ans;
    }
}