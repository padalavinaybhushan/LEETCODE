class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        for(int i=len-2;i>=0;i--)
        {
            int con = triangle.get(i).size();
            for(int j=0;j<con;j++)
            {
                int tem = Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,tem+triangle.get(i).get(j));
            }
        }
        return triangle.get(0).get(0);
    }
}