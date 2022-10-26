class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Long,Integer> hm = new HashMap<>();
        long sum = nums[0];
        hm.put(sum%k,0);
        for(int i=1;i<nums.length;i++){
            long tem = sum+nums[i];
            if(tem%k == 0) return true;
            if(hm.containsKey(tem%k)){
                if(i-hm.get(tem%k)>1) return true;
            }
            else{
                hm.put(tem%k,i);
            }
            sum = tem;
        }
        return false;
    }
}