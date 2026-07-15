class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        if (nums == null || nums.length == 0) {
            return ans;
        }

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                int leftBoundary = mid;
                int rightBoundary = mid;

                
                while (leftBoundary >= 0 && nums[leftBoundary] == target) {
                    ans[0] = leftBoundary;
                    leftBoundary--;
                }

                while (rightBoundary < nums.length && nums[rightBoundary] == target) {
                    ans[1] = rightBoundary;
                    rightBoundary++;
                }

                return ans;
            }
        }

        return ans;
    }
}
