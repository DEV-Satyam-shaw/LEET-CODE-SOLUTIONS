class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int innerScore = stack.pop();
                int scoreToAdd = Math.max(2 * innerScore, 1);
                stack.push(stack.pop() + scoreToAdd);
            }
        }

        return stack.pop();
    }
}