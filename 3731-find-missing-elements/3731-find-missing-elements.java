class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0],max = nums[0];
        for(int num : nums)
        {
            max = (num > max) ? num : max;
            min = (num < min) ? num : min;
        }

        boolean[] present = new boolean[(max-min)+1];
        for(int num : nums)
        {
            present[num-min] = true;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < present.length; i++)
        {
            if(!present[i])
            {
                result.add(i+min);
            }
        }
        return result;
    }
}