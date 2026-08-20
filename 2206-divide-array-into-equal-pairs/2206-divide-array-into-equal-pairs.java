class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int x : nums)
        {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        
        for(int x : nums)
        {
            if(freq.get(x) % 2 != 0)
            {
                return false;
            }
        }
        return true;
    }
}