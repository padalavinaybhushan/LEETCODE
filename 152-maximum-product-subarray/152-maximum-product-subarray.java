class Solution {
    public int maxProduct(int[] nums) {
        int[] arr = nums;
        int max_end_here = nums[0];
        int max_so_far = nums[0];
        int min_end_here = nums[0];
        //for every ele in array 
        // max_end_here = max(arr[i],arr[i]*max_end_here,arr[i]*min_end_here)
        // min_end_here = min(arr[i],arr[i]*max_end_here,arr[i]*min_end_here)
        // max_so_far = max(max_so_far,max_end_here)
        int len = nums.length;
        for(int i=1;i<len;i++){
            int temp = Math.max(Math.max(max_end_here*arr[i],min_end_here*arr[i]),arr[i]);
            min_end_here  = Math.min(Math.min(max_end_here*arr[i],min_end_here*arr[i]),arr[i]);
            max_end_here = temp;
            max_so_far = Math.max(max_so_far,max_end_here);
            
        }
        return max_so_far;
    }
}