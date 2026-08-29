class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int i = 1, n = arr.length;

            // if(arr[i-1] > arr[i]) return false;

            while(i < n && arr[i-1] < arr[i])
            {
                i++;
            }
            if(i == arr.length || i == 1)
            {
            return false;
            }
             while(i < n && arr[i-1] > arr[i])
            {
                i++;
            }
        return i == n;
    }
}