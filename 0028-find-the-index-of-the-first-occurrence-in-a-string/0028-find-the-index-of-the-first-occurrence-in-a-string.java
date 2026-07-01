class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
        {
            return -1;
        }
        int limit = haystack.length() - needle.length();
        for(int i = 0; i <= limit; i++)
        {
            String word = haystack.substring(i, i + needle.length());
            if(word.equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}