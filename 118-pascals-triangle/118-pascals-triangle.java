class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        tem.add(1);
        arr.add(tem);
        if(numRows == 1) return arr;
        List<Integer> tem2 = new ArrayList<>(); tem2.add(1); tem2.add(1);
        arr.add(tem2);
        for(int i=3;i<=numRows;i++)
        {
            List<Integer> t = new ArrayList<>();
            t.add(1);
            int size = arr.get(i-2).size();
            for(int j=0;j<size-1;j++) t.add(arr.get(i-2).get(j)+arr.get(i-2).get(j+1));
            t.add(1);
            arr.add(t);
        }
        return arr;
    }
}