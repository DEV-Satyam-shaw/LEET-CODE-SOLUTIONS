class Solution {
    public int climbStairs(int n, int[] costs) {
        // dp[i] stores the minimum cost to reach step i
        // Step 0 has cost 0
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int minPrev = Integer.MAX_VALUE;

            // Check possible jump sizes from previous steps: k = 1, 2, 3
            // Cost added for jump of length k is k * k
            if (i >= 1) {
                minPrev = Math.min(minPrev, dp[i - 1] + 1); // 1^2 = 1
            }
            if (i >= 2) {
                minPrev = Math.min(minPrev, dp[i - 2] + 4); // 2^2 = 4
            }
            if (i >= 3) {
                minPrev = Math.min(minPrev, dp[i - 3] + 9); // 3^2 = 9
            }

            // costs is 1-indexed in description, so step i maps to costs[i - 1]
            dp[i] = costs[i - 1] + minPrev;
        }

        return dp[n];
    }
}