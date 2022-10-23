class Solution {
    public int[] findErrorNums(int[] nums) {
        long ones = 0,two=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            ones+=(nums[i]-(i+1));
            two += (nums[i]*nums[i] - (i+1)*(i+1));
        }
        long apb = two/ones;
        int a = (int)(ones+apb)/2;
        int b = (int)(apb-a);
        int[] arr = {a,b};
        return arr;
    }
}