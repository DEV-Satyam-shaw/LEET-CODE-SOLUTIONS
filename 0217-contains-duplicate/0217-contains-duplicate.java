class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupli = new HashSet<>(nums.length);
        for(int i = 0; i < nums.length; i++)
        {
            if(!dupli.add(nums[i]))
            {
                return true;
            }
        }
        return false;
    }
}