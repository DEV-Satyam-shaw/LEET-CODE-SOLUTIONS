class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        ans[0] = findBound(nums, target, true);
        
        if (ans[0] != -1) {
            ans[1] = findBound(nums, target, false);
        }
        
        return ans;
    }
    
    private int findBound(int[] nums, int target, boolean isFirst) {
        int l = 0;
        int r = nums.length - 1;
        int bound = -1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2; 
            
            if (nums[mid] == target) {
                bound = mid; 
                if (isFirst) {
                    r = mid - 1; 
                } else {
                    l = mid + 1;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        return bound;
    }
}