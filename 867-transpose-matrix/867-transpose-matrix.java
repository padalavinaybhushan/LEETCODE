class Solution {
    public int[][] transpose(int[][] matrix) {
     int[][] ans = new int[matrix[0].length] [matrix.length];
     int l = 0;
     for(int i = 0; i < ans.length ; i++){
         int k = 0;
         for(int j = 0 ; j < ans[0].length ; j++){
            ans[i][j] = matrix[k][l];
            k ++;
         }
         l++;
     }
        return ans;
    }
}