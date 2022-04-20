class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int pre=0,res=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = -1;
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            pre += nums[i];
            if(pre == sum)
            {
                res = i+1;
            }
            if(hm.containsKey(pre) == false)
            {
                hm.put(pre,i);
            }
            else
            {
                res = Math.max(res,i-hm.get(pre));
            }
        }
        return res;
    }
}