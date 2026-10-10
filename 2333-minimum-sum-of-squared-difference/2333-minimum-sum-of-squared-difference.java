class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int maxDiff = 100000;
        long[] count = new long[maxDiff + 1];
        long totalDiff = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            count[diff]++;
            totalDiff += diff;
        }

        if (totalDiff <= k) {
            return 0;
        }
        for (int d = maxDiff; d > 0 && k > 0; d--) {
            if (count[d] == 0) {
                continue;
            }

            if (k >= count[d]) {
                k -= count[d];
                count[d - 1] += count[d];
                count[d] = 0;
            } else {
                count[d - 1] += k;
                count[d] -= k;
                k = 0;
            }
        }
        long ans = 0;
        for (int d = 1; d <= maxDiff; d++) {
            if (count[d] > 0) {
                ans += count[d] * (long) d * d;
            }
        }

        return ans;
    }
}