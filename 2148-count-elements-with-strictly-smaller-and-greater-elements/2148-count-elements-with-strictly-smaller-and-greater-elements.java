class Solution {
    public int countElements(int[] nums) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i : nums)
        {
            if(tm.containsKey(i))
            {
                tm.put(i,tm.get(i)+1);
            }
            else
            {
                tm.put(i,1);
            }
        }
        int size = tm.size();
        int count=1;
        int ans=0;
        for(Map.Entry<Integer,Integer> map : tm.entrySet())
        {
            if(count == 1 || count ==size)
            {
                ans+=0;
            }
            else
            {
                ans += (map.getValue());
            }
            count++;
        }
        return ans;
    }
}