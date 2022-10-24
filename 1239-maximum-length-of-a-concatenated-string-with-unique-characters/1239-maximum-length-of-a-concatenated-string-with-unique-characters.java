class Solution {
    public static int count(int n){
        int ans = 0;
        while(n!=0){
            ans++;
            n = n&(n-1);
        }
        return ans;
    }
    public static void solve(ArrayList<Integer> val,ArrayList<Integer> a,int ind,int prev,int n){
        if(ind == n) {
            val.add(count(prev));
            return ;
        }
        if(count(prev)+count(a.get(ind))==(count(prev|a.get(ind)))){
            solve(val,a,ind+1,prev|a.get(ind),n);
        }
        solve(val,a,ind+1,prev,n);
    }
    public int maxLength(List<String> arr) {
        int n = arr.size();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = arr.get(i);
            int t = 0;
            int len =str.length();
            int ans=0;
            for(int j=0;j<len;j++){
                ans = ans|(1<<(int)(str.charAt(j)-'a'+1));
            }
           // System.out.println(len+" "+str);
            if(count(ans) == len)
                a.add(ans);
        }
        int size = a.size();
        //System.out.println(a);
        ArrayList<Integer> val = new ArrayList<>();
        solve(val,a,0,0,size);
        val.add(0);
        //System.out.println(val);
        return Collections.max(val);
    }
}