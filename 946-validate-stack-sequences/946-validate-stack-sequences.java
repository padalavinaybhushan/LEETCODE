class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int[] arr = new int[n];
        int arr_ind = -1,p=0;
        for(int i=0;i<n;i++)
        {
            arr[++arr_ind] = pushed[i];
            int temp = arr_ind;
            while(temp>=0 && p<n && arr[temp] == popped[p])
            {
                temp--;
                p++;
            }
            arr_ind = temp;
        }
        if(arr_ind< 0)
        {
            return true;
        }
        else
        {
            return false;
        }
            
        
    }
}