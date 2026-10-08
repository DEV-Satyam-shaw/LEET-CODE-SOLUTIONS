class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int open = 0;
        int close = 0;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(' ){
                if(count == 0){
                    open = i;
                    count++;
                } else {
                    count++;
                }
            } else {
                count--;
                if(count == 0){
                    close = i;
                    ans.append(s,open+1,close);
                    open = 0;
                    close = 0;
                }
            }
        }
        return ans.toString();
    }
}