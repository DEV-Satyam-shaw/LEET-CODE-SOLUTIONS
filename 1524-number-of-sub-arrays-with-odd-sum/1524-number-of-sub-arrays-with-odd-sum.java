class Solution {
    public int numOfSubarrays(int[] arr) {

        final int MOD = 1_000_000_007;
        
        long evenCount = 1;
        long oddCount = 0;
        
        long currentSum = 0;
        long totalOddSubarrays = 0;
        
        for (int num : arr) {
            currentSum += num;
            
            if (currentSum % 2 == 0) {
                totalOddSubarrays = (totalOddSubarrays + oddCount) % MOD;
                evenCount++;
            } else {
                totalOddSubarrays = (totalOddSubarrays + evenCount) % MOD;
                oddCount++;
            }
        }
        
        return (int) totalOddSubarrays;
    }
}