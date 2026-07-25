class Solution {
    public int maxProduct(int n) {
        int first = n % 10;
        n /= 10;
        int second = n % 10;
        n /= 10;

        if(second > first )
        {
            int temp = second;
            second = first;
            first = temp;
        }
        
        while(n != 0)
        {
            int rem = n % 10;
            n /= 10;

            if(rem  > first)
            {
                second = first;
                first = rem;
            }
            else if(rem > second){
            second = rem;
            }
        }
        return first * second;
    }
}