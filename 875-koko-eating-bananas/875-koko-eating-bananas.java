class Solution {
    public static int fun(int[] piles,int low,int high,int h)
    {
        int lh = low, hi = high;
        int ans = Integer.MAX_VALUE;
        int min;
        while(lh < hi)
        {
            
            min = (lh+hi)/2;
            // System.out.println(lh+" "+min+" "+hi);
            if(min == hi || min==lh )
            {
               int tem=0;
                for(int i : piles)
                {
                    tem += (((i/min)==0)?0:(i/min)) + (((i%min)==0)?0:1);
                } 
                 if(tem > h )
                {
                    lh = min;
                }
                else
                {
                    ans = Math.min(ans,min);
                    hi = min;
                }
                break;
            }
            int tem=0;
            for(int i : piles)
            {
                tem += (((i/min)==0)?0:(i/min)) + (((i%min)==0)?0:1);
            }
            if(tem > h )
            {
                lh = min;
            }
            else
            {
                ans = Math.min(ans,min);
                hi = min;
            }
        }
        return Math.min(high,ans);
    }
    public int minEatingSpeed(int[] piles, int h) {
       long sum = 0;
        int max = piles[0];
        for(int i : piles)
        {
            sum += i;
            max = Math.max(max,i);
        }
        int min = (int)(sum/h);
        if(min ==0)
        {
            min++;
        }
        return fun(piles,min,max,h);
        // while(true)
        // {
        //     int tem=0;
        //     for(int i : piles)
        //     {
        //         tem += (((i/min)==0)?0:(i/min)) + (((i%min)==0)?0:1);
        //     }
        //     if(tem <= h)
        //     {
        //         return min;
        //     }
        //     min++;
        // }
        
    }
}