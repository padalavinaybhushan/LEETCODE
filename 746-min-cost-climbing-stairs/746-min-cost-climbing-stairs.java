class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] nums = cost;
        int[] arr = new int[len+1];
        arr[0]=cost[0];
        arr[1] = Math.min(nums[0]+nums[1],nums[1]);
        for(int i=2;i<=len;i++)
        {
            if(i == len)
            {
                arr[i] = Math.min(arr[i-1],arr[i-2]);
                break;
            }
            arr[i] = Math.min(arr[i-1],arr[i-2])+nums[i];
        }
        System.out.println(Arrays.toString(arr));
        return arr[len];
    }
}