class Solution {
    public static int floor(int[] arr,int start,int end)
    {
        int ans=arr.length;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]<0)
            {
                ans = mid;
                end=mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;
    }
    public int countNegatives(int[][] grid) {
        int ans=0;
        int end=grid[0].length-1;
        for(int[] arr : grid)
        {
            int flor = floor(arr,0,end);
            ans += (arr.length-flor);
            end = (flor == arr.length)?flor-1:flor;
        }
        return ans;
    }
}