class Solution {
    public int climbStairs(int n) {
        if(n <= 2)
        {
            return n;
        }
        int third = 0;
        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++)
        {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}