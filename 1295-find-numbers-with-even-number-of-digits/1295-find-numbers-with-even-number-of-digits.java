class Solution {
    public int findNumbers(int[] nums) {
        int count = 0,even = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int val = nums[i];
            while(val != 0)
            {
                val /= 10;
                count++;
            }
            if(count % 2 == 0)
            {
                even++;
            }
            count = 0;
        }
        return even;
    }
}