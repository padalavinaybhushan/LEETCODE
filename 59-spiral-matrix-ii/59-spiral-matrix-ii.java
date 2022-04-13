class Solution {
    public static int  solve(int[][] ans,int count,int start,int n)
    {
        for(int i=start;i<(n-start);i++)
        {
            ans[start][i] = count++;
        }
        for(int i=start+1;i<n-start-1;i++)
        {
            ans[i][n-start-1] = count++;
        }
        for(int i=n-start-1;i>start;i--)
        {
            ans[n-start-1][i] = count++;
        }
        for(int i=n-start-1;i>start;i--)
        {
            ans[i][start] = count++;
        }
        return count;
    }
    public int[][] generateMatrix(int n) {
        int count =1;
        int[][] ans = new int[n][n];
        for(int i=0;i<=n/2;i++)
        {
            count = solve(ans,count,i,n);
            
            // for(int[] r : ans)
            //     System.out.println(Arrays.toString(r));
        }
        return ans;
    }
}