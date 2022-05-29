class Solution {
    public int maxProduct(String[] words) {
        HashMap<Integer,HashSet<Character>> hm = new HashMap<>();
        int len = words.length;
        for(int i=0;i<len;i++)
        {
            String tem = words[i];
            int con = tem.length();
            HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<con;j++)
            {
                hs.add(tem.charAt(j));
            }
            hm.put(i,hs);
        }
        int ans = 0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                boolean flag = true;
                for(char ch :hm.get(i))
                {
                    if(hm.get(j).contains(ch)) 
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    ans = Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }
}