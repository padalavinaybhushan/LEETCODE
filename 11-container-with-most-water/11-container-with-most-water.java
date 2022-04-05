class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = len-1;
        while(i<j)
        {
            ans = Math.max(ans,Math.min(height[i],height[j])*(j-i));
            if(height[j]>height[i])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return ans;
    }
}