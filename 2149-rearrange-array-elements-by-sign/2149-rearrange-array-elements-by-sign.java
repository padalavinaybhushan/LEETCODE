class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i : nums)
        {
            if(i>0)
            {
                pos.add(i);
            }
            else
            {
                neg.add(i);
            }
        }
        int len = nums.length;
        int[] ans = new int[len];
        int posind=0,negind=0;
        for(int i=0;i<len;i++)
        {
            if(i%2 ==0)
            {
                ans[i] = pos.get(posind++);
            }
            else
            {
                ans[i] = neg.get(negind++);
            }
        }
        return ans;
    }
}