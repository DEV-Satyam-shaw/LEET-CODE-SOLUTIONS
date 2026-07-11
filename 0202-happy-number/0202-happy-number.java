class Solution {
    public boolean isHappy(int n) {
        if(n <= 0)
        {
            return false;
        }

        while(true)
        {
            int ans = 0;
            while( n != 0)
            {
                int rem = n % 10;
                ans = ans + rem * rem;
                n = n / 10;
            }
            if(ans == 1)
            {
                return true;
            }
            if(ans == 4 || ans == 16 || ans == 37 || ans == 58 || ans == 89 || ans == 145 || ans == 42 || ans == 20 || ans == 4)
            {
                return false;
            }
            n = ans;
        }
        // else if( n == 1 || n == 7)
        // {
        //     return true;
        // }
        //return false;
    }
}