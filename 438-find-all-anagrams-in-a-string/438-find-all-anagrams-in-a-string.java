class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int len = p.length();
        int len1 = s.length();
        for(int i=0;i<len && i<len1;i++)
        {
            char ch = s.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Character,Integer> phm = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            char ch = p.charAt(i);
            if(phm.containsKey(ch))
            {
                phm.put(ch,phm.get(ch)+1);
            }
            else
            {
                phm.put(ch,1);
            }
        }
        if(hm.equals(phm))
        {
            arr.add(0);
        }
        for(int i=len;i<len1;i++)
        {
            char ch = s.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
            if(hm.containsKey(s.charAt(i-len)))
            {
                hm.put(s.charAt(i-len),hm.get(s.charAt(i-len))-1);
                if(hm.get(s.charAt(i-len)) == 0)
                {
                    hm.remove(s.charAt(i-len));
                }
            }
            if(hm.equals(phm))
            {
                arr.add(i-len+1);
            }
        }
        return arr;
        
    }
}