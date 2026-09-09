class Solution {
    public long countCommas(long n) {
        long comma = 0;
        long divisor = 1000;
        while(n >= divisor)
        {
            comma += (n - divisor + 1);
            divisor *= 1000;
        }
        return comma;
    }
}