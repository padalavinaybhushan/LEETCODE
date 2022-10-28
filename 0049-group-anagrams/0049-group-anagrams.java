class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<Character> arr = new ArrayList<>();
        int len  = strs.length;
        HashMap<ArrayList<Character>,ArrayList<String>> hm = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            int len1 = strs[i].length();
            ArrayList<Character> tem = new ArrayList<>();
            for(int j=0;j<len1;j++)
            {
                tem.add(strs[i].charAt(j));
            }
            Collections.sort(tem);
            if(hm.containsKey(tem))
            {
                ArrayList<String> hmg = hm.get(tem);
                hmg.add(strs[i]);
                hm.put(tem,hmg);
            }
            else
            {
                ArrayList<String> hmg = new ArrayList<String>();
                hmg.add(strs[i]);
                hm.put(tem,hmg);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<ArrayList<Character>,ArrayList<String>> map : hm.entrySet())
        {
            ans.add(map.getValue());
        }
        return ans;
    }
}