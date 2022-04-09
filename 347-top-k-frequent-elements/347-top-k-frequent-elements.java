class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>();
        for(Map.Entry<Integer,Integer> t : hm.entrySet())
        {
            int ele = t.getKey();
            int frq = t.getValue();
            if(tm.containsKey(frq))
            {
                ArrayList<Integer> tem = tm.get(frq);
                tem.add(ele);
                tm.put(frq,tem);
            }
            else
            {
                ArrayList<Integer> tem = new ArrayList<>();
                tem.add(ele);
                tm.put(frq,tem);
            }
            
        }
        //System.out.println(hm);
        //System.out.println(tm);
        ArrayList<Integer> ans  = new ArrayList<>();
        while(k > 0)
        {
            int frq = tm.lastKey();
            ArrayList<Integer> tem = tm.get(frq);
            int size = tem.size();
            k = k - size;
            for(int i=0;i<size;i++)
            {
                ans.add(tem.get(i));
            }
            tm.remove(frq);
        }
        int size = ans.size();
        int[] las = new int[size];
        for(int i=0;i<size;i++)
        {
            las[i] = ans.get(i);
        }
        return las;   
    }
}