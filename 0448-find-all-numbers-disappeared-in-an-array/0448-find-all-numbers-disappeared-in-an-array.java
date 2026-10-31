class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        boolean[] arr = new boolean[n];

        for(int x:nums){
            arr[x-1] = true;
        }

        for(int i = 0;i < n; i++){
            if(arr[i] == false){
                ans.add(i+1);
            }
        }
        return ans;
    }
}