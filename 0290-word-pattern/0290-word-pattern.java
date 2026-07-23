class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length() != word.length)
        {
            return false;
        }

        Map map = new HashMap<>();

        for(Integer i = 0; i < pattern.length(); i++)
        {
            if(map.put(pattern.charAt(i), i) != map.put(word[i] , i))
            {
                return false;
            }
        }
        return true;
    }
}