class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        if not nums:
            return 0
        currlen = 1
        maxlen = 1

        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                currlen += 1
            else:
                currlen = 1
            maxlen = max(maxlen, currlen)
        return maxlen