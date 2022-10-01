class Solution {
   static HashSet<String> hs = new HashSet<>();
    static{
        for(int i=1;i<=26;i++){
            hs.add(Integer.toString(i));
        }
    }
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len];
        for(int i=len-1;i>=0;i--){
            if(i== len-1){
                if(hs.contains(s.substring(i,i+1))){
                    dp[i] = 1;
                }
            }
            else{
                if(hs.contains(s.substring(i,i+2))){
                    if(i==len-2)
                        dp[i]=dp[i+1]+1;
                    else
                        dp[i]=dp[i+1]+dp[i+2];
                }
                else if(hs.contains(s.substring(i,i+1))){
                    dp[i]=dp[i+1];
                }
                else{
                    int tem = Integer.parseInt(s.substring(i,i+2));
                    if(tem>27 || tem ==0){
                        return 0;
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}