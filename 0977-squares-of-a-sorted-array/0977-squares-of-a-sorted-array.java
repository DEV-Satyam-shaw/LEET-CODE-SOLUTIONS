class Solution {
    public int[] sortedSquares(int[] nums) {
        int k = nums.length-1;
        int r = nums.length-1;
        int l = 0;
        int[] result = new int[nums.length];
        while(l <= r)
        {
            if((nums[r] * nums[r]) >= (nums[l] * nums[l]))
            {
                result[k] = nums[r] * nums[r];
                k--;r--;
            }else if((nums[l] * nums[l]) > (nums[r] * nums[r]))
            {
                result[k] = nums[l] * nums[l];
                k--;l++;
            }
        }
        return result;
    }
}