class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0];
        int sum=0,len=nums.length;
        int[] ans = new int[len];
        for(int i=1;i<len;i++){
            sum = sum + nums[i] - first;
        }
        int ind=0;
        ans[ind++] = sum;
        int prev = 0,next=len-2;
        for(int i=1;i<len;i++)
        {
            int diff = (nums[i]-nums[i-1]);
            sum = sum + diff*(prev-next);
            ans[ind++] = sum;
            prev++;
            next--;
        }
        return ans;
    }
}