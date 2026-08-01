class Solution {
    public String removeDuplicates(String s) {
        char[] arr = new char[s.length()];
        int left = 0;

        for(int i = 0; i < s.length(); i++)
        {

            if( left > 0 && arr[left - 1] == s.charAt(i))
            {
                left--;
            } else 
            {
                arr[left] = s.charAt(i);
                left++;
            }
        }
        return new String(arr , 0 ,left);
    }
}