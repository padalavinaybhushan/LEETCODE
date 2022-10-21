class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                ArrayList<Integer> tem = hm.get(nums[i]);
                tem.add(i);
                hm.put(nums[i],tem);
            }
            else{
                ArrayList<Integer> tem = new ArrayList<>();
                tem.add(i);
                hm.put(nums[i],tem);
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> map:hm.entrySet()){
            ArrayList<Integer> tem = map.getValue();
            int size = tem.size();
            if(size > 1){
                for(int i=1;i<size;i++){
                    if(Math.abs(tem.get(i)-tem.get(i-1))<=k) return true;
                }
            }
        }
        return false;
    }
}