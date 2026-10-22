class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int[] lastseenS = new int[256];
        int[] lastseenT = new int[256];

        for(int i = 0; i < n; i++){
            char sh = s.charAt(i);
            char th = t.charAt(i);

            if(lastseenS[sh] != lastseenT[th]){
                return false;
            }
            lastseenS[sh] = i + 1;
            lastseenT[th] = i + 1;
        }
        return true;
    }
}