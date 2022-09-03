class Solution {
    public static void solve(int n,int k,String str,int pres,int count,HashSet<Integer> hs){
        if(count == n){
            hs.add(Integer.parseInt(str));
            return;
        }
        int tem = pres+k;
        if(tem<10 && tem>=0){
            solve(n,k,str+Integer.toString(tem),tem,count+1,hs);
        }
        tem = pres-k;
        if(tem<10 && tem>=0){
            solve(n,k,str+Integer.toString(tem),tem,count+1,hs);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=1;i<10;i++){
            solve(n,k,Integer.toString(i),i,1,hs);
        }
        int[] arr = new int[hs.size()];
        int c=0;
        for(int i : hs){
            arr[c++] = i;
        }
        return arr;
    }
}