class Solution {
    public String longestPalindrome(String str) {
        int n = str.length();
        int ans = 1;
        int index =0;
        int oe = -1;
        for(int i =0;i<n;i++)
            {
                int odp = i,odl = i-1,odr = i+1,odlen = 1;
                while((odl >= 0) && (odr <= (n-1)) && (str.charAt(odl) == str.charAt(odr)) )
                {
                    odlen+=2;
                    odl--;
                    odr++;
                    
                }
                int evpl = i,evpr = i+1,evenlen =0;
                while((evpl >= 0) && (evpr <= (n-1) && str.charAt(evpl)==str.charAt(evpr )))
                {
                    evenlen +=2;
                    evpl--;
                    evpr++;
                    
                }
                ans = Math.max(ans,Math.max(odlen,evenlen ));
            if(ans  == odlen)
            {
                index = i;
                oe = 1;
            }
            else if(ans == evenlen)
            {
                index = i;
                oe = 2;
            }
                
            }
        if(oe == 1)
        {
            return str.substring(index-(ans/2),index+(ans/2)+1);
        }
        else 
        {
            return str.substring(index-(ans/2)+1,index+(ans/2)+1);
        }
           
        
    }
}