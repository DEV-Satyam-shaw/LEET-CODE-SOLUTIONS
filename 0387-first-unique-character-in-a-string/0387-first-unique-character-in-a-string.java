class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        // char ele = 'a';
        // for(int i = 0; i < 26; i++)
        // {
        //     if(freq[i] == 1)
        //     {
        //         ele = (char) (i + 'a');
        //     }
        // }
        for(int i = 0; i < s.length(); i++)
        {
            // int elefreq = freq[s.charAt(i) - 'a'];
            if(freq[s.charAt(i) - 'a'] == 1)
            return i;
        }
        return -1;
    }
}