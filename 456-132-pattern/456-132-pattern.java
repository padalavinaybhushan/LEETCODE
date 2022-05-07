class Solution {
    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if(len <3 )return false;
        int[] left = new int[len];
        left[0] = nums[0];
        for(int i=1;i<len;i++)
        {
            left[i] = Math.min(left[i-1],nums[i]);
        }
        Stack<Integer> st = new Stack<>();
        st.push(nums[len-1]);
        for(int j=len-2;j>=0;j--)
        {
            if(nums[j] > left[j])
            {
                while(!st.isEmpty() && st.peek()<=left[j]) st.pop();
                if(!st.isEmpty() && st.peek()<nums[j]) return true;
                st.push(nums[j]);
            }
        }
        return false;
        
    }
}