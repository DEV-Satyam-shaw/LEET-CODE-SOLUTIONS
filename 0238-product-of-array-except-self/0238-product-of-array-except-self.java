class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lp = 1;
        int[] ans =new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i < nums.length; i++)
        {
            lp = lp * nums[i-1];
            ans[i] = lp;
        }
        lp = 1;
        for(int j = nums.length - 1; j > 0; j--)
        {
            lp *=  nums[j];
            ans[j-1] *= lp;
        }
        return ans;
    }
}