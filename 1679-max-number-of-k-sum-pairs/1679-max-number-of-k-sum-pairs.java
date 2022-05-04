class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans=0;
        for(int i : nums)
        {
            if(hm.containsKey(k-i))
            {
                hm.put(k-i,hm.get(k-i)-1);
                if(hm.get(k-i) == 0) hm.remove(k-i);
                ans++;
            }
            else
                hm.put(i,hm.getOrDefault(i,0)+1);
        }
        return ans;
    }
}