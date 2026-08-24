class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int len = 0, l = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char n = s.charAt(i);
           freq.put(n, freq.getOrDefault(n, 0)+1);

           while(freq.get(n) > 1){
            freq.put(s.charAt(l), freq.get(s.charAt(l))-1);
            l++;
           }
           len = Math.max(len, i-l+1);
        }
        return len;
    }
}