class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:stones)
        {
            arr.add(i);
        }
        while(arr.size() > 1)
        {
            int max_ind1 = arr.indexOf(Collections.max(arr));
            int ele = arr.get(max_ind1);
            arr.remove(max_ind1);
            int max_ind2 = arr.indexOf(Collections.max(arr));
            int ele1 = arr.get(max_ind2);
            arr.remove(max_ind2);
            if(ele != ele1)
            {
                arr.add(ele-ele1);
            }
            
        }
        if(arr.size() == 0)
        {
            return 0;
        }
        return arr.get(0);
            
    }
}