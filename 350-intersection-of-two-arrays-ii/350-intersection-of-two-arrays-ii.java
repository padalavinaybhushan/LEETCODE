class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i : nums1)
        {
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
        for(int i : nums2)
        {
            hm2.put(i,hm2.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(Map.Entry<Integer,Integer> map : hm1.entrySet())
        {
            int key = map.getKey();
            int val = map.getValue();
            if(hm2.containsKey(key))
            {
                arr.put(key,Math.min(val,hm2.get(key)));
            }
        }
        ArrayList<Integer> tem = new ArrayList<>();
        for(Map.Entry<Integer,Integer> map : arr.entrySet())
        {
            int val = map.getValue();
            int key = map.getKey();
            for(int i=0;i<val;i++) tem.add(key);
        }
        return tem.stream().mapToInt(i -> i).toArray();
    }
}