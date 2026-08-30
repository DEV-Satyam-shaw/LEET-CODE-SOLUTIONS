class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1) return 1;
        int n = nums.length;

        int lowind = 0, highind = 0;
        for(int i = 1; i < n; i++)
        {
            if(nums[i] > nums[highind])
            {
                highind = i;
            }
            if(nums[i] < nums[lowind])
            {
                lowind = i;
            }
        }
        int left = Math.min(lowind, highind);
        int right = Math.max(lowind, highind);

        int bothfront = right + 1;
        int bothback = n - left;
        int frontandback = (n - right) + (left + 1);

        return Math.min(bothfront, Math.min(bothback, frontandback));
    }
}