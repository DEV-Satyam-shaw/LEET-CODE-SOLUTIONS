class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i = 1; i <= nums.length; i++)
        {
            xor = xor ^ i;
        } 

        for(int j = 0; j < nums.length; j++)
        {
            xor = xor ^ nums[j];
        }
        return xor;
    }
}