class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        int idx = 0;
        int num = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > num){
                idx = i;
                num = nums[i];
            }
        }
        return idx;
    }
}