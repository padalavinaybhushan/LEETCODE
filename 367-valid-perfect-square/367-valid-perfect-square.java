class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0,high= num;
        if(num == 1) return true;//edge case
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(mid == 0)
            {
                if(mid == num) return true;
                else return false;
            }
            if(mid == (num*1.0)/mid) return true;
            if(mid > num/mid) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}