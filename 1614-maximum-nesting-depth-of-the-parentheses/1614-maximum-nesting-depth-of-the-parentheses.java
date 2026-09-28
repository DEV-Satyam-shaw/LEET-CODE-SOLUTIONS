class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int maxcount = 0;
        int currcount = 0;
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(') currcount++;
            if(ch == ')') currcount--;

            maxcount = Math.max(maxcount, currcount);
        }
        return maxcount;
    }
}