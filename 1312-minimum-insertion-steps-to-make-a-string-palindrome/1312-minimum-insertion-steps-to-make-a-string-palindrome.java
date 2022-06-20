class Solution {
    public int minInsertions(String s) {
        int len = s.length();
        int n = len;
        int[][] ans = new int[n][n];
        for(int i=1;i<len;i++)
        {
            int lv = 0;
            for(int j=i;j<len;j++)
            {
                if(s.charAt(lv) == s.charAt(j))
                {
                    ans[lv][j] = ans[lv+1][j-1];
                }
                else
                {
                    ans[lv][j]=Math.min(ans[lv][j-1],ans[lv+1][j])+1;
                }
                lv++;
            }
            // for(int[] tem : ans)
            // {
            //     System.out.println(Arrays.toString(tem));
            // }
            // System.out.println("--------------------------------------------------------");
        }
        return ans[0][len-1];
    }
}