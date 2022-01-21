class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        for(String str : words1)
        {
            if(hm1.containsKey(str))
            {
                hm1.put(str,hm1.get(str)+1);
            }
            else
            {
                hm1.put(str,1);
            }
        }
        for(String str : words2)
        {
            if(hm2.containsKey(str))
            {
                hm2.put(str,hm2.get(str)+1);
            }
            else
            {
                hm2.put(str,1);
            }
        }
        int ans=0;
        for(Map.Entry<String,Integer> map : hm1.entrySet())
        {
            int val = map.getValue();
            String str = map.getKey();
            if(val ==1)
            {
                if(hm2.containsKey(str) && (hm2.get(str) == 1))
                {
                    ans++;
                }
            }
        }
        return ans;
        
    }
}