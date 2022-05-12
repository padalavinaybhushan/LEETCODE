class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> parent = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums) {
            hm.put(i, hm.getOrDefault(i,0) + 1);
        }
        pHelper(parent, new ArrayList<>(), nums, 0, hm);
        return parent;
    }
    
    public void pHelper(List<List<Integer>> parent, ArrayList<Integer> child, int[] nums, int idx, HashMap<Integer, Integer> hm) {
        if(idx == nums.length) {
            parent.add(new ArrayList<>(child));
            return;
        }
        
        for(int i : hm.keySet()) {
            if(hm.get(i) > 0) {
                hm.put(i, hm.get(i)-1);
                child.add(i);
                pHelper(parent, child, nums, idx + 1, hm);
                child.remove(child.size()-1);
                hm.put(i, hm.get(i) + 1);
            }
        }
    }
}