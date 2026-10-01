class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] stack = new int[n];
        int[] pairs = new int[n];
        int top = -1;

        for(int i = 0; i < n; i++)
        {
            char c = s.charAt(i);
            if(c == '('){
                stack[++top] = i;
            }else if(c == ')'){
                int j = stack[top--];
                pairs[j] = i;
                pairs[i] = j;
            }
        }

        StringBuilder result = new StringBuilder();
        int direction = 1;
        int i = 0;
        while(i < n)
        {
            char c = s.charAt(i);
            if(c == '(' || c == ')'){
                i = pairs[i];
                direction = -direction;
            } else {
                result.append(c);
            }
            i += direction;
        }
        return result.toString();
    }
}