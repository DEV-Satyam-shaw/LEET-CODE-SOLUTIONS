class Solution {
    public int lengthOfLastWord(String s) {
        String clean = s.trim(); 
        int lastspace = clean.lastIndexOf(" ");

        int len = clean.length();

        return (len - lastspace) - 1;
    }
}