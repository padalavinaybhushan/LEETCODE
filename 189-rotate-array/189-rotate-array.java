class Solution {
    public static void reverse(int[] arr,int len,int start,int end)
    {
        //System.out.println(start+" "+end);
        while(start < end)
        {
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
            //System.out.println(arr[start]);
            end--;
            start++;
        }
    }
    public void rotate(int[] nums, int k) {
       
        int len = nums.length;
         k = k%len;
        
        reverse(nums,len,0,len-k-1);
        reverse(nums,len,len-k,len-1);
        reverse(nums,len,0,len-1);
        // return nums;
    }
}