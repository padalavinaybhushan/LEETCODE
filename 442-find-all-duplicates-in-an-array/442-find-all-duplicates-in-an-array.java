class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            //System.out.println(nums[i]+ " ");
            if(nums[i] == -1) continue;
            
            while(nums[i] != i+1 && nums[i] != -2){
                //System.out.print(nums[i]+" "+Arrays.toString(nums));
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
                //if(nums[i] == -2) break;
            }
            if(nums[i] == i+1) nums[i] = -1;
            //System.out.println();
        }
        return ans;
    }
}