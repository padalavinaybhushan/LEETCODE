class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int sum =0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            left[i] = sum;
        }
        for(int i=0;i<nums.length;i++)
        {
            right[i] = sum;
            sum -= nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(left[i] == right[i])
            {
                return i;
            }
        }
        if(right[0] == nums[0])
        {
            return 0;
        }
        else if(left[nums.length-1] == nums[nums.length-1])
        {
            return nums.length;
        }
        else 
        {
            return -1;
        }
        
    }
}