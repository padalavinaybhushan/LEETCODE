class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String str : words)
        {
            if(hm.containsKey(str))
            {
                hm.put(str,hm.get(str)+1);
            }
            else 
            {
                hm.put(str,1);
            }
        }
        int ans  = 0;
        HashSet<String> hs = new HashSet<>();
        boolean flag = true;
        for(Map.Entry<String,Integer> map : hm.entrySet())
        {
            String key = map.getKey();
            int val = map.getValue();
            StringBuilder tem = new StringBuilder(key);
            String temp = tem.reverse().toString();
            if(temp.equals(key) )
            {
              
                ans += ((val - (val%2))*2);
                if(val%2 == 1)
                {
                    if(flag)
                    {
                        ans += (2);
                        flag = false;
                    }
                }
            }
            else 
            {
                if(hm.containsKey(temp))
                {
                    if(!hs.contains(temp))
                    {
                        ans += (4*Math.min(val,hm.get(temp)));
                        hs.add(temp);
                        hs.add(key);
                    }
                        
                }
            }
        }
        return ans;
        
    }
}