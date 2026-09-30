class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int count = 0;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++)
        {
            if(seq.charAt(i) == '('){
                count++;
                ans[i] = count % 2;
            }
            else if(seq.charAt(i) == ')')
            {
                ans[i] = count % 2;
                count--;
            }
        }
        return ans;
    }
}