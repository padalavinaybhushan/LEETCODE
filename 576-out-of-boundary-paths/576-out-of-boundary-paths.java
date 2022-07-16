class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long mod = (long)1e9+7;
        Long dp[][][] = new Long[m][n][maxMove+1];
        long paths = findPaths(m,n,maxMove,startRow,startColumn,mod,dp);
        
        int finalPaths = (int)(paths%mod);
        if(finalPaths<0) finalPaths+=(int)mod;
        return finalPaths;
    }
    
    private long findPaths(int rows,int cols,int movesLeft,int row,int col,long mod,
    Long dp[][][]){
        if(row>=rows||col>=cols||row<0||col<0) return 1;
        if(movesLeft==0) return 0;
        if(dp[row][col][movesLeft]!=null) return dp[row][col][movesLeft];
        long paths = 0;
        
        paths = ((paths%mod) + (findPaths(rows,cols,movesLeft-1,row-1,col,mod,dp)%mod))%mod;
        paths = ((paths%mod) + (findPaths(rows,cols,movesLeft-1,row+1,col,mod,dp)%mod))%mod;
        paths = ((paths%mod) + (findPaths(rows,cols,movesLeft-1,row,col-1,mod,dp)%mod))%mod;
        paths = ((paths%mod) + (findPaths(rows,cols,movesLeft-1,row,col+1,mod,dp)%mod))%mod;
        
        return dp[row][col][movesLeft] = paths;
    }
}