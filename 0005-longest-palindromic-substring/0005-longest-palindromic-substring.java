class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int lenOdd = expandFromCenter(s, i, i);       // e.g., "aba"
            int lenEven = expandFromCenter(s, i, i + 1);   // e.g., "abba"
            int maxLen = Math.max(lenOdd, lenEven);

            if (maxLen > end - start + 1) {
                // Calculate the new boundary indices
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Length of the valid palindrome before mismatch
        return right - left - 1;
    }
}