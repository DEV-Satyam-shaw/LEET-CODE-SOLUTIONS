class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];

        for(int x : nums){
            arr[x]++;
        }

        int sum = 0;
        for(int x : nums){
            if(arr[x] == 1){
                sum += x;
            }
        }
        return sum;
    }
}