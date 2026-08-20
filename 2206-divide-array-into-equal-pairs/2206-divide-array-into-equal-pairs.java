class Solution {
    public boolean divideArray(int[] nums) {
        // Map<Integer, Integer> freq = new HashMap<>();
        int freq[] = new int[501];
        for(int x : nums)
        {
            freq[x]++;
        }
        
        for(int x : nums)
        {
            if(freq[x] % 2 != 0)
            {
                return false;
            }
        }
        return true;
    }
}