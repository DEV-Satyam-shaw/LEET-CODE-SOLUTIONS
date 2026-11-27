class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int count = 0;
        int num = nums[n/2];

        for(int x : nums){
            if(x == num){
                count++;
            }
        }
        return count == 1;
    }
}