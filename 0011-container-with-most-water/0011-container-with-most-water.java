class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        int curr = 0;
        while(left < right)
        {
            int low = Math.min(height[left], height[right]);

            curr = (right - left) * low;

            ans = Math.max(curr, ans);

           if(height[right] > height[left])
           {
            left++;
           }
           else
           {
            right --;
           }
        }
        return ans;
    }
}