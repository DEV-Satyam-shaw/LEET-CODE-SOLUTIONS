class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq =  new int[128];
        int len = 0, l = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char n = s.charAt(i);
           l = Math.max(l, freq[n]);

           freq[n] = i + 1;
           len = Math.max(len, i-l+1);
        }
        return len;
    }
}