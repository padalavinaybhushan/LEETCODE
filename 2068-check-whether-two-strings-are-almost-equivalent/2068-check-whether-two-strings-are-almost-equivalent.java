class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr = new int[26];
        int len1 = word1.length();
        for(int i=0;i<len1;i++)
        {
            arr[word1.charAt(i)-'a']++;
            arr[word2.charAt(i)-'a']--;
        }
        for(int a:arr)
        {
            if(a>3 || a<-3)
            {
                return false;
            }
        }
        return true;
    }
}