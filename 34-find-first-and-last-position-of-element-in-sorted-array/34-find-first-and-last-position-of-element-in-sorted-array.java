class Solution {
    public int[] searchRange(int[] nums, int target) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i:nums)
        {
            tm.put(i,tm.getOrDefault(i,0)+1);
        }
        int[] ans = new int[2];
        int curr =-1;
        if(tm.containsKey(target))
        {
            for(Map.Entry<Integer,Integer> t : tm.entrySet())
            {
                int key = t.getKey();
                int val = t.getValue();
                if(key == target)
                {
                    ans[0] = (++curr);
                    ans[1] = val-1+curr;
                    return ans;
                }
                else
                {
                    curr += (val);
                }
            }
        }
            Arrays.fill(ans,-1);
            return ans;
        
    }
}