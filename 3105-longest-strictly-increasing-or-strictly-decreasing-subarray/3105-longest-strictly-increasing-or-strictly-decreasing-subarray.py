class Solution:
    def longestMonotonicSubarray(self, nums: list[int]) -> int:
        if not nums:
            return 0
            
        max_len = 1
        
        # Pass 1: Strictly increasing
        inc_len = 1
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                inc_len += 1
                max_len = max(max_len, inc_len)
            else:
                inc_len = 1
                
        # Pass 2: Strictly decreasing
        dec_len = 1
        for i in range(1, len(nums)):
            if nums[i] < nums[i - 1]:
                dec_len += 1
                max_len = max(max_len, dec_len)
            else:
                dec_len = 1
                
        return max_len