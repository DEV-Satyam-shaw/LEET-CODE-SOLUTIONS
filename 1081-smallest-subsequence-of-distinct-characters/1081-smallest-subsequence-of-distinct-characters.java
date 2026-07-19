class Solution {
    public String smallestSubsequence(String s) {
        // Track the last seen index of each character
        int[] lastOcc = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastOcc[s.charAt(i) - 'a'] = i;
        }
        
        // Tracks whether a character is already present in our current result
        boolean[] visited = new boolean[26];
        
        // StringBuilder will act as our Monotonic Stack
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            
            // Skip if the character is already included in our result
            if (visited[idx]) {
                continue;
            }
            
            // Pop elements from the stack if:
            // 1. Stack is not empty
            // 2. The top element is lexicographically greater than the current character
            // 3. The top element occurs again later in the string
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && lastOcc[sb.charAt(sb.length() - 1) - 'a'] > i) {
                // Mark the popped character as unvisited so it can be added later
                visited[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            
            // Add the current character and mark it as visited
            sb.append(c);
            visited[idx] = true;
        }
        
        return sb.toString();
    }
}