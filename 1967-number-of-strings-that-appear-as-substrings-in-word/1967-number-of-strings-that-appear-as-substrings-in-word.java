class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for(String i : patterns)
        {
            if(word.indexOf(i)>=0)
            {
                ans++;
            }
        }
        return ans;
        
    }
}