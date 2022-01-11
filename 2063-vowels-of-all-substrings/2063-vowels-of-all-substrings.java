class Solution {
    public long countVowels(String word) {
        HashSet<Character> hs  = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        int len = word.length();
         long count=0;
        for(int i=0;i<len;i++)
        {
            if(hs.contains(word.charAt(i)))
            {
                if(i==0 || i==len-1)
                {
                    count+=(len);
                }
                else 
                {
                    count += (long)(((long)i+1)*(len-i));
                }
            }
        }
        return count;
    }
}