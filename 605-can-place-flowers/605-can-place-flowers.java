class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len  = flowerbed.length;
        if(len ==1 )
        {
            if(flowerbed[0] ==1)
            {
                if(n==0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(n<=1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            if(i==0)
            {
                if(flowerbed[i] == 1)
                {
                    flowerbed[i+1]=-1;
                }
            }
            else if(i== len-1)
            {
                if(flowerbed[i] == 1)
                {
                    flowerbed[i-1]=-1;
                }
            }
            else
            {
                if(flowerbed[i] == 1)
                {
                    flowerbed[i+1]=-1;
                    flowerbed[i-1] = -1;
                }
            }
        }
        int ans =0;
        ArrayList<Integer> tem = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            if(flowerbed[i] == 0)
            {
                tem.add(i);
            }
        }
        int size= tem.size();
        int count=1;
        ArrayList<Integer> tem2 = new ArrayList<>();
        int i=0;
        
        for( i=0;i<size-1;i++)
        {
            
            if(tem.get(i)+1 == tem.get(i+1))
            {
                count++;
            }
            else
            {
                tem2.add(count);
                count=1;
                
            }
        }
        if(size !=0)
            tem2.add(count);
        // System.out.println(tem2);
        
        for(int j: tem2)
        {
            ans += ((j%2==1)?(j/2 +1):(j/2));
        }
        if(n<=ans)
        {
            return true;
        }
        return false;
    }
}