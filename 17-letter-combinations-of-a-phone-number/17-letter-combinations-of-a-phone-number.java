class Solution {
    public List<String> letterCombinations(String str) {
        List<String> arr = new ArrayList<>();
        int len = str.length();
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        for(int i=0;i<len;i++)
        {
            if(i == 0)
            {
                int num = Integer.parseInt(str.substring(i,i+1));
                String map = hm.get(num);
                int len_map = map.length();
                List<String> tem = new ArrayList<>();
                for(int j=0;j<len_map;j++)
                {
                    tem.add(map.substring(j,j+1));   
                }
                arr = tem;
                continue;
            }
            int num = Integer.parseInt(str.substring(i,i+1));
            String map = hm.get(num);
            int len_map = map.length();
            List<String> tem = new ArrayList<>();
            for(int j=0;j<len_map;j++)
            {
                
                for(String str1 : arr)
                {
                    tem.add(str1+map.substring(j,j+1));
                }
            }
            arr = tem;
        }
        return arr;
    }
}