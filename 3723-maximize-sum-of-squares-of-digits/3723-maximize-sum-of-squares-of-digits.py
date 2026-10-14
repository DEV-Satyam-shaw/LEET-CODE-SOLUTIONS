class Solution:
    def maxSumOfSquares(self, num: int, sum: int) -> str:
     if num * 9 < sum or sum < 1:
        return ""

     count9 = sum // 9
     rem = sum % 9
     count0 = num - count9 - (1 if rem > 0 else 0)

     if count0 < 0:
        return ""
     mid = str(rem) if rem > 0 else ""
     return ("9" * count9) + mid + ("0" * count0)
