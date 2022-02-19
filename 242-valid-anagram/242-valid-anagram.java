class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2)
        {
            return false;
        }
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<len1;i++)
        {
            char ch = s.charAt(i);
            if(hm1.containsKey(ch))
            {
                hm1.put(ch,hm1.get(ch)+1);
            }
            else
            {
                hm1.put(ch,1);
            }
        }
        for(int i=0;i<len1;i++)
        {
            char ch = t.charAt(i);
            if(hm1.containsKey(ch))
            {
                hm1.put(ch,hm1.get(ch)-1);
                if(hm1.get(ch) == 0)
                {
                    hm1.remove(ch);
                }
            }
            else
            {
                return false;
            }
        }
        if(hm1.size() == 0)
        {
            return true;
        }
        return false;
    }
}