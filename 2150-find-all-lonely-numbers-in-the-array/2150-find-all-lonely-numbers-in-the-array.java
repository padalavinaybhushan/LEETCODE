class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        ArrayList<Integer> ans  = new ArrayList<>();
        for(Map.Entry<Integer,Integer> map : hm.entrySet())
        {
            int key = map.getKey();
            int val = map.getValue();
            if(val == 1)
            {
                if(!hm.containsKey(key-1) && !hm.containsKey(key+1))
                {
                    ans.add(key);
                }
            }
        }
        return ans;
    }
}