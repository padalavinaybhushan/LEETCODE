class Solution {
    public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer> pre = new HashMap<>();
        HashMap<Integer,Integer> suf = new HashMap<>();
        int n = nums.length;
        pre.put(nums[0],0);
        suf.put(nums[nums.length-1],n-1);
        int[] pre_arr = new int[n];
        int[] suf_arr = new int[n];
        pre_arr[0] = nums[0];
        suf_arr[n-1] = nums[n-1];
        for(int i=1,j=n-2;i<=n-1&&j>=0;i++,j--)
        {
            pre_arr[i] = nums[i]+pre_arr[i-1];
            suf_arr[j] = nums[j]+suf_arr[j+1];
        }
        for(int i=0;i<n;i++)
        {
            pre.put(pre_arr[i],i);
            suf.put(suf_arr[i],i);
        }
        int ans = Integer.MAX_VALUE;
        if(pre.containsKey(x)) ans = Math.min(ans,pre.get(x)+1);
        if(suf.containsKey(x)) ans = Math.min(ans,n-suf.get(x));
        for(int i=0;i<n;i++)
        {
            if(suf.containsKey(x-pre_arr[i]))
            {
                int ind = suf.get(x-pre_arr[i]);
                if(ind > i)
                {
                    ans = Math.min(ans,i+(n-ind)+1);
                }
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(pre.containsKey(x-suf_arr[i]))
            {
                int ind = pre.get(x-suf_arr[i]);
                if(ind < i)
                {
                    ans = Math.min(ans,ind+(n-i)+1);
                }
            }
        }
        return (ans == Integer.MAX_VALUE)?-1:ans;
    }
}