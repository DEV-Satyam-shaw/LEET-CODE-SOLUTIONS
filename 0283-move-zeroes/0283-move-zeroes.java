class Solution {
    public void moveZeroes(int[] nums) {
        int r = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[r] = nums[i];
                r++;
            }
        }
        while(r < nums.length)
        {
            nums[r] = 0;
            r++;
        }
        return;
    }
}