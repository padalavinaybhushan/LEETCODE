class Solution {
    public int myAtoi(String s) {
        // System.out.println(s.length());
        // return (int)Math.floor(Math.log10(Long.MAX_VALUE)+1);
        s = s.trim();
        // System.out.println(s);
        int len  = s.length();
        boolean flag = true;
        String ans ="";
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i) == '-' || s.charAt(i) == '+')
            {
                
                if(i == 0)
                {
                    if(s.charAt(i)=='-')
                        flag = false; 
                }
                      
                else 
                    break;
            }
            else if('0'<=s.charAt(i) && s.charAt(i)<='9')
            {
                ans += Character.toString(s.charAt(i));
            }
            else 
            {
                break;
            }
            
        }
        if(ans.length() == 0)
        {
            return 0;
        }
        else 
        {
           
            try
            {
                long tem = Long.parseLong(ans);
                tem = (flag)?(tem):(-1*tem);
            if(tem<min)
            {
                return min;
            }
            else if(tem > max)
            {
                return max;
            }
            else 
            {
                return (flag)?(int)tem:(int)(tem);
            }
            }
            catch(Exception e)
            {
                
            
                if(!flag)
                {
                    return min;
                }
                else
                {
                    return max;
                }
            
            }
           
            
            
        }
    }
}