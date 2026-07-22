class Solution {
    public int addDigits(int num) {

        if(num < 10)
        {
            return num;
        }
        int num2 = 0;
        while(num != 0)
        {
            int rem = num % 10;
            num2 = num2 + rem;
            num /= 10;
        }
        return addDigits(num2);
    }
}