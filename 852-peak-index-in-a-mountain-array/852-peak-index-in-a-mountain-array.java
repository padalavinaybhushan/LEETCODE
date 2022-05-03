class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int low = 0,high= len-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(mid == 0 || mid == len-1) return -1;
            if(arr[mid-1] < arr[mid] && arr[mid]>arr[mid+1]) return mid;
            if(arr[mid-1] < arr[mid]) low = mid;
            else high = mid;
        }
        return -1;
    }
}