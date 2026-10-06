class Solution {
    public int minAddToMakeValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else if(stack.size() > 0){
                char ch = stack.pop();
                if(ch == ')'){
                    stack.push(c);
                    stack.push(ch);
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}