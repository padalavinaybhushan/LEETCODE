class Solution {
    public int brokenCalc(int startValue, int target) {
        if(target == startValue)
        {
            return 0;
        }
        
        if(target > startValue)
        {
            int tar = target;
            int val = startValue;
            int count=0;
            while(tar != val)
            {
                if(tar == val)
                {
                    return  count;
                }
                if(tar>val)
                {
                   if(tar%2 == 0)
                {
                    tar /= 2;
                    count++;
                }
                else 
                {
                    tar++;
                    count++;
                }
                if(tar == val)
                {
                    return count;
                } 
                }
                else 
                {
                    count += (val-tar);
                    tar = val;
                    return count;
                }
                
            }
            
        }
        else 
        {
            return startValue-target;
        }
        return -1;
        
    }
}