class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len <3)
        {
            return false;
        }
        int largest =-1;
        for(int i=0;i<len-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }
            else
            {
                largest = i;
                break;
            }
        }
        if(largest==0 || largest==-1)
        {
            return false;
        }
        boolean flag = false;
        for(int i=largest;i<len-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                continue;
            }
            else
            {
                flag = true;
                break;
            }
        }
        if(flag)
        {
            return false;
        }
        return true;
    }
}