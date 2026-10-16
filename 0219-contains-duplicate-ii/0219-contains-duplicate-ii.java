class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> lastseen = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(lastseen.containsKey(nums[i])){
                if(i - lastseen.get(nums[i]) <= k){
                    return true;
                }
            }
            lastseen.put(nums[i],i);
        }
        return false;
    }
}