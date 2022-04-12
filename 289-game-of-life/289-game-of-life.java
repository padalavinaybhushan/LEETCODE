class Solution {
    public static boolean check(int[][] arr,int i,int j,int row,int col)
    {
        int count1=0;
        if(i-1>=0)
        {
            if(arr[i-1][j] == 1) count1++;
            if(j-1>=0) 
            {
                if(arr[i-1][j-1] == 1) count1++;
            }
            if(j+1<col) 
            {
                if(arr[i-1][j+1] == 1) count1++;
            }
        }
        if(i+1 < row)
        {
            if(arr[i+1][j] == 1) count1++;
            if(j-1>=0) 
            {
                if(arr[i+1][j-1] == 1) count1++;
            }
            if(j+1<col) 
            {
                if(arr[i+1][j+1] == 1) count1++;
            }
        }
        if(j-1>=0) 
            {
                if(arr[i][j-1] == 1) count1++;
            }
            if(j+1<col) 
            {
                if(arr[i][j+1] == 1) count1++;
            }
        if(arr[i][j] == 0) if(count1 == 3) return true; else return false;
        if(count1<2)
        {
            return false;
        }
        if(count1>3) return false;
        return true;
    }
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] ans = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                ans[i][j] = (check(board,i,j,row,col))?1:0;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                board[i][j] = ans[i][j];
            }
        }
    }
}