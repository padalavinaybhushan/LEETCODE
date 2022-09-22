class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int len = nums.length;
        int que = queries.length;
        int[] arr = new int[que];
        int odd = 0,even = 0;
        int count = 0;
        for(int i : nums){
            if(i%2 != 0) odd+=i;
            else even+=i;
        }
        for(int[] tem : queries){
           // System.out.println(nums[tem[1]]+" "+nums[tem[1]]%2);
            if(nums[tem[1]]%2 != 0 ){
                //System.out.println(1+" "+nums[tem[1]]);
                odd-=nums[tem[1]];
                nums[tem[1]]+=tem[0];
                if(nums[tem[1]]%2 != 0){
                    odd+=nums[tem[1]];
                }
                else{
                    
                    even+=nums[tem[1]];
                }
            }
            else{
                //System.out.println(2+" "+nums[tem[1]]);
                even-=nums[tem[1]];
                nums[tem[1]]+=tem[0];
                if(nums[tem[1]]%2 != 0){
                    odd+=nums[tem[1]];
                }
                else{
                    
                    even+=nums[tem[1]];
                }            
            }
          //  System.out.println(Arrays.toString(nums));
            arr[count++] = even;
        }
        return arr;
    }
}