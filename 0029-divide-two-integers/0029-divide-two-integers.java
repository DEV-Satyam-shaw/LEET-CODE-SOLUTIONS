class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long absdividend = Math.abs((long)dividend);
        long absdivisor = Math.abs((long)divisor);
        int result = 0;

        while(absdividend >= absdivisor)
        {
            long tempdivisor = absdivisor;
            int multiple = 1;

            while(absdividend >= (tempdivisor << 1))
            {
                tempdivisor <<= 1;
                multiple <<= 1;
            }
            absdividend -= tempdivisor;
            result += multiple;
        }
        return isNegative ? -result : result;
    }
}