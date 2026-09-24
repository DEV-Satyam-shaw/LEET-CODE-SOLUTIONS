class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int x = nums[i];
            int sum = 0;
            while(x != 0)
            {
                int rem = x % 10;
                sum += rem;
                x /= 10;
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}