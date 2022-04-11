class Solution {
    public static void reverse(List<Integer> arr,int start,int end)
    {
        int las = end;
        for(int i=start;i<=(start+end)/2;i++)
        {
            int tem = arr.get(i);
            arr.set(i,arr.get(las));
            arr.set(las,tem);
            las--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> tem = new ArrayList<>();
        for(int[] t : grid)
        {
            for(int r : t)
            {
                tem.add(r);
            }
        }
        //System.out.println(tem);
        int size = tem.size();
        k = k%size;
        reverse(tem,0,size-k-1);
         //System.out.println(tem);
        reverse(tem,size-k,size-1);
         //System.out.println(tem);
        reverse(tem,0,size-1);
        //System.out.println(tem);
        int r_s = grid.length;
        int c_s = grid[0].length;
        int c=0;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<r_s;i++)
        {
            List<Integer> tem1 = new ArrayList<>();
            for(int j=0;j<c_s;j++)
            {
                tem1.add(tem.get(c++));
            }
            ans.add(tem1);
        }
        return ans;
    }
}