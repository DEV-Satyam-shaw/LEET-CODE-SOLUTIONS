class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halfLen = n / 2;
        
        char[] half = s.substring(0, halfLen).toCharArray();
        Arrays.sort(half);
        
        String firstHalf = new String(half);
        String mid = (n % 2 == 1) ? String.valueOf(s.charAt(halfLen)) : "";
        
        StringBuilder secondHalf = new StringBuilder(firstHalf).reverse();
        
        return firstHalf + mid + secondHalf.toString();
    }
}