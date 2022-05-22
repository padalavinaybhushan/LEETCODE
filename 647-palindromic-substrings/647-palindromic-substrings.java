class Solution {
    public static int odd(String str,int len,int ind)
    {
        int count=0;
        while(ind-count>=0 && ind+count <len)
        {
            //System.out.println(str.charAt(ind-count) == str.charAt(ind+count));
            if(str.charAt(ind-count) == str.charAt(ind+count)) count++;
            else return count*2-1;
        }
        return count*2 -1 ;
    }
    public static int even(String str,int len,int ind)
    {
        int count=0;
        if(str.charAt(ind) == str.charAt(ind+1)) count++;
        else return 1;
        while(ind-count>=0 && ind+count+1 <len)
        {
            if(str.charAt(ind-count) == str.charAt(ind+count+1))  count++;
            else return count*2;
        }
        return count*2;
        
    }
    public int countSubstrings(String s) {
        int len = s.length();
        int ans=0;
        for(int i=0;i<len-1;i++)
        {
             int tem = odd(s,len,i);
                ans += (tem/2 + 1);
           //System.out.println((tem/2 + 1)+"  "+ s.charAt(i)+ " odd "+odd(s,len,i));
             tem = even(s,len,i);
            //System.out.println((tem/2)+"  "+ s.charAt(i)+ "  even "+even(s,len,i));
            ans += (tem/2 );
            
        }
        return ans+1;
    }
}