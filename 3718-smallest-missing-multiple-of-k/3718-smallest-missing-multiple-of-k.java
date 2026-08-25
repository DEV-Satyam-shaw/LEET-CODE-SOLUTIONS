class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] yes = new  boolean[101];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % k == 0)
            {
                int mul = nums[i] / k;
                yes[mul] = true;
            }
        }

        for(int i = 1; i < 101; i++)
        {
            if(yes[i] == false)
            {
                return i*k;
            }
        }
        return 101;
    }
}