class Solution {
    public int solve(int n ,HashSet<Integer> hs,HashMap<Integer,Integer> ans)
    {
        //System.out.println(n+ "   "+ ts);
        if(n == 0) return 0;
       // System.out.println(n);
        if(ans.containsKey(n)) return ans.get(n);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : hs)
        {
            if(n-i>=0) arr.add(1+solve(n-i,hs,ans));
        }
        int temp = Collections.min(arr);
        ans.put(n,temp);
        return temp;
    }
    public int numSquares(int n) {
        HashSet<Integer> sr = new  HashSet<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(i*i <= n)
            {
                sr.add(i*i);
            }
        }
        HashMap<Integer,Integer> ans = new HashMap<>();
        return solve(n,sr,ans);
    }
}