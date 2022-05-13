class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            if(nums[i] == -1) continue;
            
            while(nums[i] != i+1 && nums[i] != -2){
                int temp = nums[nums[i]-1];
                if(temp == -1) 
                {
                    ans.add(nums[i]);
                    nums[i] = -2;
                }
                else 
                {
                    nums[nums[i]-1] = -1;
                    nums[i] = temp;
                }
            }
            if(nums[i] == i+1) nums[i] = -1;
            
        }
        return ans.get(0);
    }
}