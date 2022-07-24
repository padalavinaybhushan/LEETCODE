class Solution {
    public static int floor(int[] arr,int i,int j,int tar){
        int ans=Integer.MIN_VALUE;
        int low=i,high=j;
        while(low<=high){
            int mid =low+(high-low)/2;
            //System.out.println(low+" "+high+" "+arr[mid]);
            if(arr[mid] <=tar)
            {
                ans = mid;
                low=mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return ans;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int ans= -1;
        for(int i=0;i<matrix.length;i++){
            //System.out.println("-----------------------"+i);
            if(i==0){
                int tem = floor(matrix[i],0,matrix[0].length-1,target);
                if(tem == Integer.MIN_VALUE) return false;
                if(matrix[i][tem] == target) return true;
                ans= tem;
            }
            else{
                ans= floor(matrix[i],0,matrix[0].length-1,target);
                if(ans == Integer.MIN_VALUE) return false;
                if(matrix[i][ans] == target) return true;
            }
        }
        return false;
        
    }
}