class Solution {
    public int missingNumber(int[] nums) {
      // int len = nums.length,sum=0;
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        return (nums.length*(nums.length+1))/2  - nums[nums.length-1];
    }
}