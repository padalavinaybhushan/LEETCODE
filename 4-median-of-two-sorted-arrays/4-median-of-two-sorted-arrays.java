class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1+n2];
        int lo = 0;
        int l1=0,l2=0;
        while(l1 < n1 && l2 < n2)
        {
            if(nums1[l1] <= nums2[l2])
            {
                arr[lo++] = nums1[l1++];
            }
            else 
            {
                arr[lo++] = nums2[l2++];
            }
        }
        while(l1 < n1)
        {
            arr[lo++] = nums1[l1++];
        }
        while(l2 < n2)
        {
            arr[lo++] = nums2[l2++];
        }
        if((n1+n2)%2 == 0)
        {
            int ind = (n1+n2)/2;
            int ind2 = ind-1;
            System.out.println(Arrays.toString(arr)+" "+arr[ind]+" "+arr[ind2]);
            double ans = (arr[ind]+arr[ind2])/2.0;
            return ans;
            
        }
        else 
        {
            double ans = arr[(int)(n1+n2)/2];
            return ans;
        }
    }
}