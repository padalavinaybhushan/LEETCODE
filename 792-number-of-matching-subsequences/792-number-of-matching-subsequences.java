class Solution {
    public static boolean issub(String s,String tar)
    {
        int len1 = s.length(),len2=tar.length();
        int i=0,j=0;
        while(i<len1 && j <len2)
        {
            char c1 = s.charAt(i),c2=tar.charAt(j);
            if(c1 == c2 ){
                i++;j++;
            }
            else 
            {
                j++;
            }
        }
        return i==len1;
    }
    public int numMatchingSubseq(String s, String[] words) {
        int ans =0;
        HashMap<String,Integer> hm = new HashMap<>();
        for(String str : words)
        {
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        for(String str : hm.keySet()){
            ans += (issub(str,s)?hm.get(str):0);
        }
        return ans;
    }
}