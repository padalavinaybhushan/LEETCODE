class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int[] count = new int[row];
        for(int i=0;i<row;i++)
        {
            int one=0;
            for(int j=0;j<col;j++)
            {
                if(mat[i][j] == 1)
                {
                    one++;
                }
            }
            count[i] = one;
        }
        int[] ans = new int[k];
        int st =0;
        for(int i=0;i<k;i++)
        {
            int min = count[0];
            int min_ind = 0;
            for(int j=0;j<row;j++)
            {
                if(count[j]<min)
                {
                    min=count[j];
                    min_ind = j;
                }
            }
            ans[st++] = min_ind;
            count[min_ind] = Integer.MAX_VALUE;
        }
        return ans;
    }
}