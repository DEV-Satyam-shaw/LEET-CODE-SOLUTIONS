class Solution {
    public String smallestPalindrome(String s) {
       int n = s.length();
       int[] count = new int[26];

       for(int i = 0; i < n / 2; i++)
       {
        count[s.charAt(i) - 'a']++;
       } 
       char[] arr = s.toCharArray();

       int idx = 0;
       for(int i = 0; i < 26; i++)
       {
        while(count[i]-- > 0)
        {
            arr[idx++] = (char)(i + 'a');
        }
       }
       for(int i = 0; i < n / 2; i++)
       {
        arr[n-1-i] = arr[i];
       }
       return new String(arr);
    }
}