class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int c = 0;
        int ans=0;
        for(int i=cost.length-1;i>=0;i--){
           c++; 
            if(c%3 != 0) ans+=cost[i];
            
        }
        return ans;
    }
}