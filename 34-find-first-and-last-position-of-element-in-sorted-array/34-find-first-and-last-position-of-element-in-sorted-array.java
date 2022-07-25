class Solution {
    public static int floor(int[] arr,int tar,int i,int j){
        int low=i,high=j,ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == tar){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid] < tar){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int ceil(int[] arr,int tar,int i,int j){
        int low=i,high=j,ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == tar){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid] < tar){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0]=floor(nums,target,0,nums.length-1);
        ans[1]=ceil(nums,target,0,nums.length-1);
        return ans;
    }
}