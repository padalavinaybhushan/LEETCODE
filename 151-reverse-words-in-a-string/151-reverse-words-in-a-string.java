class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        int arrlen=0;
        for(String i : str)
        {
            int spc = 0;
            i = i.trim();
            int len = i.length();
            
            for(int j=0;j<len;j++)
            {
                if(i.charAt(j) == ' ')
                {
                    spc++;
                }
            }
            if(spc != len)
            {
                arr.add(i);
                arrlen++;
            }
        }
        String ans = "";
        for(int i = arrlen-1;i>=0;i--)
        {
            ans += (arr.get(i) +" ");
        }
        return ans.substring(0,ans.length()-1);
    }
}