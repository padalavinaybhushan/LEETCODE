class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0,h = nums.length-1;
        int[] arr = nums;
        while(l < h)
        {
            if(arr[l]%2 != 0)
            {
                int tem = arr[l];
                arr[l] = arr[h];
                arr[h] = tem;
                h--;
            }
            else
            {
                l++;
            }
            
        }
        return nums;
    }
}