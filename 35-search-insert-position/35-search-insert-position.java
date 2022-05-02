class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len-1;
        int max = len;
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]<target) 
            {
                low = mid+1;
            }
            else
            {
                max = Math.min(mid,max);
                high = mid-1;
               
            }
        }
        return max;
    }
}