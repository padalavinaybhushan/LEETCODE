class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> hs1 = new LinkedHashSet<>();
        for(String i: arr)
        {
            if(hs.contains(i))
            {
                if(hs1.contains(i))
                {
                    hs1.remove(i);
                }
            }
            else 
            {
                hs1.add(i);
                hs.add(i);
                // System.out.println(hs1);
            }
        }
        int size = hs1.size();
        // System.out.println(hs1);
        if(k<=size)
        {
            int count=1;
            for(String i:hs1)
            {
                if(count == (k))
                {
                    return i;
                }
                count++;
            }
        }
        return "";
        
    }
}