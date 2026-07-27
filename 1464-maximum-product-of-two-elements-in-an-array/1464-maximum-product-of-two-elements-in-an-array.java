class Solution {
    public int maxProduct(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        
        if(b > a)
        {
           int temp = b; b = a; a = temp;
        }
        for(int i = 2; i < nums.length; i++)
        {
            if(nums[i] > a)
            {
                b = a; a = nums[i];
            }
            else if(nums[i] > b)
            {
                b = nums[i];
            }
        }
        return (a-1) * (b-1);
    }
}