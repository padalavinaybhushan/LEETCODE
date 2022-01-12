class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans=0;
        for(int i : nums)
        {
            int diff =  i-k;
            int diff1 = i+k;
            if(hm.containsKey(diff) || hm.containsKey(diff1))
            {
                if(diff == diff1)
                {
                    ans += (hm.get(diff));
                }
                else 
                {
                   if(hm.containsKey(diff))
                    ans += (hm.get(diff));
                if(hm.containsKey(diff1))
                    ans += hm.get(diff1); 
                } 
            }
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        return ans;
        
    }
}