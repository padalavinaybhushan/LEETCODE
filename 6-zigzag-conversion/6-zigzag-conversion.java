class Solution {
    public String convert(String s, int r) {
        
        int len = s.length();
        if(r>=len||r==1)
        {
            return s;
        }
        int nofele = (2*r)-3;
        String str = "";
        ArrayList<Integer>  arr = new ArrayList<>();
        for(int i=0;i<len;i+=(nofele+1))
        {
            str += (Character.toString(s.charAt(i)));
            arr.add(i);
        }
        ArrayList<String> tem = new ArrayList<>();
        tem.add(str);
        for(int j=0;j<r-1;j++)
        {
            String temstr  = "";
            tem.add(temstr);
        }
        for(int i:arr)
        {
            int curr = i+1;
            int count=0;
            int neg =1;
            while(curr<len && count<nofele)
            {
                int vin = (curr-i);
                if(vin>(r-1))
                {
                    vin = (r-1)-neg;
                    neg++;
                }
                String mod = tem.get(vin);
                mod += Character.toString(s.charAt(curr));
                
                tem.set(vin,mod);
                // System.out.println(mod+" "+vin+" "+tem.get(vin));
                curr++;
                count++;
            }
        }
        String ans ="";
        for(String i: tem)
        {
            ans += i;
        }
        
        return ans;
        
    }
}