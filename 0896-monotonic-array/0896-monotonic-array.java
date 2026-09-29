class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean dec = true;
        boolean inc = true;
        for(int i = 1; i < n;i++)
        {
            if(nums[i-1] < nums[i])
            {
                dec = false;
            }
        }
        for(int i = 1; i < n;i++)
        {
            if(nums[i-1] > nums[i])
            {
                inc  = false;
            }
        }
        if(dec == true || inc == true) return true;
        else return false;
    }
}