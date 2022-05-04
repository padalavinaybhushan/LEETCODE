class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high = x;
        if(x == 1) return 1;
        int mid=0;
        int ans= 1;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            System.out.println(mid);
            if(mid == 0) return 0;
            if(mid == (x)/mid) return mid;
            if(mid > x/mid ) high = mid-1;
            else 
            {
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }
}