class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int l = 0,h=len-1;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                h=mid-1;
            }
            else 
            {
                l = mid+1;
            }
        }
        return -1;
    }
}