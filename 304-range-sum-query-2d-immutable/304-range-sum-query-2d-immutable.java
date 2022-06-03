class NumMatrix {
    int[][] arr;
    public NumMatrix(int[][] matrix) {
        arr = new int[matrix.length][matrix[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                arr[i][j] += arr[i][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i=row1;i<=row2;i++)
        {
            sum += ((col1!=0)?(arr[i][col2]-arr[i][col1-1]):(arr[i][col2]));
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */