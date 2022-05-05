class Solution {
    public int ceil(int[] arr,int len ,int val)
    {
        int start = 0;
        int end = len-1;
        int ans = -1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            //if(arr[mid] == val) return mid;
             if(arr[mid] >= val)
            {
                ans = mid;
                start = mid+1;
            }
            else 
                end = mid-1;
        }
        return ans;
        
    }
    public int maxDistance(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 =  nums2.length;
        int ans= 0;
        for(int i=0;i<len1;i++)
        {
            int j = ceil(nums2,len2,nums1[i]);
            if(ans != -1)
            {
                if(j>i) ans = Math.max(ans,j-i);
            }
        }
        return ans;
    }
}