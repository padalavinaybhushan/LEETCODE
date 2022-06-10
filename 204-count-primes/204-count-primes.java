class Solution {
    public int countPrimes(int n) {
        n--;
        if(n==0 || n==1 || n==-1) return 0;
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]= false;
        arr[1] = false;
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    arr[j] = false;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++) if(arr[i]) count++;
        return count;
    }
}