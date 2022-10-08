class Solution {
    public static void solve(int ind,int n,int open,int close,String str,ArrayList<String> arr){
        if(ind >= (2*n)){
            arr.add(str);
            return ;
        }
        if(open>=close && open<(n)){
            solve(ind+1,n,open+1,close,str+"(",arr);
        }
        if(close<open && close<(n)){
            solve(ind+1,n,open,close+1,str+")",arr);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr = new ArrayList<>();
        solve(0,n,0,0,"",arr);
        return arr;
    }
}