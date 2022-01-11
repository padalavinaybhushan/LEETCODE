class Solution {
    public static boolean fun(String str)
    {
        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> vow = new HashSet<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        int len = str.length();
        for(int i=0;i<len ;i++)
        {
            hs.add(str.charAt(i));
        }
        if(hs.equals(vow))
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
    public int countVowelSubstrings(String word) {
        int curr = 5;
        int n = word.length();
        int count=0;
        for(int j= curr;j<=n;j++){
            
        for(int i=0;i<=(n-j);i++)
        {
            if(fun(word.substring(i,i+j)))
            {
                count++;
            }
        }
       
        }
        return count;
    }
}