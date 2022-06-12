class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int len = nums.length,ans = Integer.MIN_VALUE;
        int sum = nums[0];
        int[] pre = new int[len];
        pre[0]=nums[0];
        for(int i=1;i<len;i++)
        {
            pre[i] = nums[i]+ pre[i-1];
        }
        hm.put(nums[0],0);
        int start=0;
        //System.out.println(Arrays.toString(pre));
        for(int i=1;i<len;i++)
        {
            if(hm.containsKey(nums[i]) && hm.get(nums[i])>=start)
            {
                sum = pre[i]-pre[hm.get(nums[i])];
                start=hm.get(nums[i])+1;
            }
            else
            {
                sum+=nums[i];
                
            }
            ans = Math.max(ans,sum);
            //System.out.println(ans+" "+sum);
            hm.put(nums[i],i);
            nums[i] += nums[i-1];
            
        }
        return Math.max(sum,ans);
    }
}