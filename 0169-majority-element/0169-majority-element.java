class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0;
        int vote = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(vote == 0)
            {
                ele = nums[i];
                vote++;
            }
            else if(nums[i] == ele)
            {
                vote++;
            }
            else if(nums[i] != ele)
            {
                vote--;
            }

        }
        return ele;
    }
}