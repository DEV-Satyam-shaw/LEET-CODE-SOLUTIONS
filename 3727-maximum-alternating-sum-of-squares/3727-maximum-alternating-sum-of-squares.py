class Solution(object):
    def maxAlternatingSum(self, nums):
        n = len(nums)

        for i in range(n):
            nums[i] *= nums[i]
        nums.sort()

        ans = 0
        cut = n/2
        for i in range(cut):
            ans -= nums[i]
        for i in range(cut,n,1):
            ans += nums[i]
        return ans
        """
        :type nums: List[int]
        :rtype: int
        """
        