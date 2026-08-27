class Solution {
    public int arrangeCoins(int n) {
        long ans = 0, count = 0;
        for(int i = 1; ans < n; i++)
        {
            ans = ans + i;
            count++;
        }
        if(ans == n) return (int)count;
        else return (int)(count -= 1);
    }
}