class Solution {
    public String removeDuplicateLetters(String s) {
         int[] lastOcc = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastOcc[s.charAt(i) - 'a'] = i;
        }
    
        boolean[] visited = new boolean[26];

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            
            if (visited[idx]) {
                continue;
            }

            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && lastOcc[sb.charAt(sb.length() - 1) - 'a'] > i) {
               
                visited[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            visited[idx] = true;
        }
        
        return sb.toString();
    }
}