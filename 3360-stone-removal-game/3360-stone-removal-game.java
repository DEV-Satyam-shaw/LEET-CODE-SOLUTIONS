class Solution {
    public boolean canAliceWin(int n) {

        boolean Alice = true;

        int x = 10;
        while(n >= x){
            n -= x;
            x--;
            Alice = !Alice;
        }
        return !Alice;
    }
}