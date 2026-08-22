class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1;
        int no = n;
        while(no != 0)
        {
            int rem = no % 10;
            sum += rem;
            prod *= rem;
            no /= 10;
        }
        if(n % (sum + prod) == 0)
        {
            return true;
        }
        return false;
    }
}