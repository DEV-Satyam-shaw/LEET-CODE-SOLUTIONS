class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m+n];
        int median = 0;
        float ans = 0; 
        int i = 0, j = 0, k = 0;
        while(j < n && i < m)
        {
            if(nums1[i] < nums2[j])
            {
                result[k] = nums1[i];
                i++;
            }
            else
            {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m)
        {
            result[k] = nums1[i];
            i++;k++;
        }
        while(j < n)
        {
            result[k] = nums2[j];
            j++;k++;
        }
        if((m+n) % 2 != 0)
        {
            median = (m+n)/2;
            ans = result[median];
        } else
        {
            median = (m+n)/2;
            int s = median - 1;
            ans = (result[median]+result[s]);
            ans = ans / 2;
        }
        return ans;
    }
}