class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(mid == 0 || mid == nums.length-1) return nums[mid];
            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1])
            {
                return nums[mid];
            }
            else
            {
                if(mid%2 == 0)
                {
                    if(nums[mid] == nums[mid+1])
                    {
                        low = mid+ 2;
                    }
                    else
                    {
                        high =mid- 2;
                    }
                }
                else
                {
                    if(nums[mid] == nums[mid-1])
                    {
                        low = mid+1;
                    }
                    else
                    {
                        high = mid-1;
                    }
                }
            }
        }
        return -1;
    }
}