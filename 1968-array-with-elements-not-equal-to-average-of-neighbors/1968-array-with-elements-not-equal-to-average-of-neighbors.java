class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int len  = nums.length;
        boolean flag = ((len & 1)==1)?true:false;
        int[] ans =  new int[len];
        if(flag)
        {
            int odind =1;
            for(int i=len-1;i>=(len-(len/2));i--)
            {
                ans[odind] = nums[i];
                odind+=2;
            }
            odind =0;
            for(int i = (len-(len/2)-1);i>=0;i--)
            {
                ans[odind] = nums[i];
                odind+=2;
            }
        }
        else 
        {
            int odind =1;
            for(int i=len-1;i>=(len-(len/2));i--)
            {
                ans[odind] = nums[i];
                odind+=2;
            }
            odind =0;
            for(int i = (len-(len/2)-1);i>=0;i--)
            {
                ans[odind] = nums[i];
                odind+=2;
            }
        }
        return ans;
    }
}