class Solution {
    public int maxDistToClosest(int[] seats) {
        TreeSet<Integer> arr = new TreeSet<>();
        ArrayList<Integer> tem = new ArrayList<>();
        int len = seats.length;
        for(int i=0;i<len;i++)
        {
            if(seats[i] == 1)
            {
                arr.add(i);
            }
            else
            {
                tem.add(i);
            }
        }
        int ans =1;
        for(int i : tem)
        {
            int floor=Integer.MAX_VALUE;
            int ceil=  Integer.MAX_VALUE;
                floor = (arr.floor(i)!=null)?(i-arr.floor(i)):Integer.MAX_VALUE;
                ceil = (arr.ceiling(i)!=null)?(arr.ceiling(i)-i):Integer.MAX_VALUE;
            ans = Math.max(ans,Math.min(floor,ceil));
        }
        return ans;
        
    }
}