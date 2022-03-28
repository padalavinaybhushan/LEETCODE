class Solution {
    public int search(int[] a, int target) {
        int n = a.length;
        int lo = 0, hi = n-1, rslt = -1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (a[mid] == target){
                return mid;
            } else if (a[lo] <= a[mid]){
                if (a[lo] <= target && target <= a[mid]){
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (a[mid] <= a[hi]){
                if (a[mid] <= target && target <= a[hi]){
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return rslt;
    }
}