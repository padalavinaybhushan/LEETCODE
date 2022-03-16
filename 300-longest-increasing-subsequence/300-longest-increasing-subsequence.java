class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
        for(int i=1;i<n;i++)
        {
             lis.add(1);
            for(int j=0;j<i;j++)
            {
                if(arr[j] < arr[i])
                {
                    lis.set(i,Math.max(lis.get(i),lis.get(j)+1));
                }
            }
        }
        return Collections.max(lis);
    }
}