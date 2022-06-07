class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=n-1,j=1;i>=0;i--,j++)
        {
            nums1[m+n-j] = nums2[i];
        }
        Arrays.sort(nums1);
        
    }
}