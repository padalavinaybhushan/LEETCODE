class Solution {
    public static boolean upper(String up,int len)
    {
        for(int i=1;i<len;i++)
        {
            if((up.charAt(i)>='a') && (up.charAt(i)<='z'))
            {
                return false;
            }
        }
        return true;
    }
     public static boolean lower(String lo,int len)
    {
        for(int i=1;i<len;i++)
        {
            if((lo.charAt(i)>='A') && (lo.charAt(i)<='Z'))
            {
                return false;
            }
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        int len  = word.length();
        if(word.charAt(0)>='A' && word.charAt(0)<='Z')
        {
            if(upper(word,len) || lower(word,len))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            String str = word.toLowerCase();
            if(str.equals(word))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }
}