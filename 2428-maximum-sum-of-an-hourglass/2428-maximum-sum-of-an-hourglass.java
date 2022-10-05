class Solution {
    public int maxSum(int[][] grid) {
        int[][] sum = new int[grid.length][grid[0].length];
        int[][] mid = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 2; j < grid[i].length; j++) {
                sum[i][j] = grid[i][j-2] + grid[i][j-1] + grid[i][j];
                mid[i][j] = grid[i][j-1];
            }
        }
        int max = 0;
        for (int i = 0; i < grid.length-2; i++) {
            for (int j = 2; j < grid[i].length; j++) {
                max = Math.max(max, sum[i][j]+mid[i+1][j]+sum[i+2][j]);
            }
        }
        return max;
    }
}