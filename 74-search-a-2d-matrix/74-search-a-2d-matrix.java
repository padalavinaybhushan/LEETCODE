class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int row = matrix.length;
        int col = matrix[0].length;
        boolean flag = false;
        int row_no= 0;
        for(int i=0;i<row;i++)
        {
            //System.out.println(matrix[i][col-1]);
            if(matrix[i][col-1] >= target)
            {
                row_no = i;
                flag = true;
                break;
            }
        }
        //System.out.println(flag+" "+row_no);
        if(flag)
        {
            for(int i=0;i<col;i++)
            {
                if(matrix[row_no][i] == target)
                {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}