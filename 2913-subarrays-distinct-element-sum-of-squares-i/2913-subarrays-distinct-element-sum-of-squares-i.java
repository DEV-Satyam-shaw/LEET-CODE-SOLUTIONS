class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        long totalSum = 0;
        int MOD = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            Set<Integer> distinct = new HashSet<>();
            for (int j = i; j < n; j++) {
                distinct.add(nums.get(j));
                int count = distinct.size();
                totalSum = (totalSum + (long) count * count) % MOD;
            }
        }
        return (int) totalSum;
    }
}