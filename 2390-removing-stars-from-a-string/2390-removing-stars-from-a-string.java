class Solution {
    public String removeStars(String s) {
        int l = 0;
        char[] res = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '*' && l != 0)
            {
                l--;
            } else 
            {
                res[l] = s.charAt(i);
                l++;
            }
        }
        return String.valueOf(res, 0, l);
    }
}