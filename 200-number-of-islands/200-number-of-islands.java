class Solution {
    public static void fun(char[][] a,int i,int j,int row,int col){
        //System.out.println(i+" "+j);
        if(i<0 || j<0 || i>= row || j>=col){
           // System.out.println("k");
            return ;
        }
        if(a[i][j] == '0') return;
        a[i][j] = '0';
        fun(a,i-1,j,row,col);
        fun(a,i,j-1,row,col);
        fun(a,i+1,j,row,col);
        fun(a,i,j+1,row,col);
    }
    public int numIslands(char[][] grid) {
        int row=grid.length,col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1') {
                    count++;
                    fun(grid,i,j,row,col);
                }
            }
        }
        return count;
    }
}