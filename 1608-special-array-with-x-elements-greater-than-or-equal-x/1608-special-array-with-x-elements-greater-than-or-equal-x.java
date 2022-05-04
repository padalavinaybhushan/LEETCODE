class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0;i<=len;i++)
        {
            int low = 0;
            int high = len-1;
            int ans =len;
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                if(nums[mid] == i)
                {
                    ans = mid;
                    high=mid-1;
                }
                else if(nums[mid] < i)
                {
                    low = mid+1;
                }
                else 
                {
                    ans = mid;
                    high=mid-1;
                }
            }
            //System.out.println(i+" "+(len-ans));
            if(i == (len-ans)) return i;
        }
        return -1;
        
    }
}