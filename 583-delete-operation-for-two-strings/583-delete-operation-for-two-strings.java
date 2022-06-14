class Solution {
    public static int solve(int[][] arr,int m,int n,String a,String b,int len1,int len2)
    {
        if(arr[m][n] != -1) return arr[m][n];
        if(m==0 || n==0) 
        {
            arr[m][n] = 0;
            return arr[m][n];
        }
        if(a.charAt(m-1) == b.charAt(n-1))
        {
            arr[m][n] = 1+solve(arr,m-1,n-1,a,b,len1,len2);
        }
        else
        {
            arr[m][n] = Math.max(solve(arr,m-1,n,a,b,len1,len2),solve(arr,m,n-1,a,b,len1,len2));
        }
        return arr[m][n];
    }
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(),len2 = word2.length();
        int[][] arr = new int[len1+1][len2+1];
        for(int[] t : arr)
        {
            Arrays.fill(t,-1);
        }
        int ans = solve(arr,len1,len2,word1,word2,len1,len2);
        return Math.abs(ans-len1)+Math.abs(ans-len2);
    }
}