class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
       int mod=1000000007;
       int N=arr.length; 
       long dp[]=new long[N];
       Arrays.fill(dp,1);
       HashMap<Integer,Integer> map=new HashMap<>();
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           map.put(arr[i],i);
       }
       for(int i=0;i<N;i++){
           for(int j=0;j<i;j++){
               if(arr[i]%arr[j]==0){ 
                   //left child ( so that right is integer)
                int right=arr[i]/arr[j];
                int idx=map.getOrDefault(right,-1);
                if(idx!=-1) dp[i]=(dp[i]+dp[idx]*dp[j])%mod;   
           }
       } 
    }
    long ans=0;
    for(long x:dp) ans+=x;
    return (int)(ans%mod);    
   }
}