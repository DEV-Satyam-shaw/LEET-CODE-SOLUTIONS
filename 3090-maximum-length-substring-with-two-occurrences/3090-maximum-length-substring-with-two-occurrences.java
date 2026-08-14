class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxLen = 0;
        int l = 0;
        for(int i = 0; i < s.length(); i++)
        {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i) , 0)+1);

            while(freq.get(s.charAt(i)) > 2)
            {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, i-l+1);
        }
        // maxLen = (l == 0) ? maxLen : maxLen-1;
        return maxLen;
    }
}