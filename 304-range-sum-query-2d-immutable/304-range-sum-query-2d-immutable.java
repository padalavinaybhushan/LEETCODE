class NumMatrix {
    int[][] arr;
    public NumMatrix(int[][] matrix) {
        arr = matrix;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                arr[i][j] += arr[i][j-1];
            }
        }
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                arr[j][i] += arr[j-1][i];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0,extra=0;
        if(row1 != 0)
        {
            extra += (arr[row1-1][col2]);
        }
        if(col1 != 0)
        {
            extra += (arr[row2][col1-1]);
        }
        return arr[row2][col2]-extra+((row1!=0 && col1!=0)?(arr[row1-1][col1-1]):0);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */