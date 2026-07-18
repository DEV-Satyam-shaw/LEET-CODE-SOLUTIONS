class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int answer = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if (nums[i] > max)
            {
                max = nums[i];
            }  else if( nums[i] < min)
            {
                min = nums[i];
            }
        }
        for(int j = 2; j <= min; j++)
        {
            if(max % j == 0 && min % j == 0)
            {
                answer = j;
            }
        }
        return answer;
    }
}