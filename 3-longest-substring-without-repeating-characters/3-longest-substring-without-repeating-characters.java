class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p1=0,p2=0;
        int len = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        while(p2<len)
        {
            char ch = s.charAt(p2);
            if(hm.containsKey(ch))
            {
                int tem =hm.get(ch);
                for(int i=p1;i<=tem;i++) hm.remove(s.charAt(i));
                p1 = tem+1;
                hm.put(ch,p2);
                p2++;
                //ans = Math.max(ans,hm.size());
                ;
                ans = Math.max(ans,p2-p1);
            }
            else
            {
                hm.put(ch,p2);
                p2++;
                ans = Math.max(ans,p2-p1);
            }
            //System.out.println(hm+" "+ans);
        }
        return (ans==Integer.MIN_VALUE)?0:ans;
    }
}