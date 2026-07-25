class Solution {
    public int maxProduct(int n) {
        int f = n % 10;
        n /= 10;

        int s = n % 10;
        n /= 10;

        if(s > f)
        {
            int temp = f;
            f = s;
            s = temp;
        }

        while(n != 0)
        {
            int r = n % 10;
            n /= 10;

            if(r > f)
            {
                s = f;
                f = r;
            }
            else if(r > s)
            {
                s = r;
            }
        }
        return f * s;
    }
}