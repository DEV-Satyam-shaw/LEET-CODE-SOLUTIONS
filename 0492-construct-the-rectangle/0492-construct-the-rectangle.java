class Solution {
    public int[] constructRectangle(int area) {
        // Start width at floor(sqrt(area))
        int w = (int) Math.sqrt(area);
        
        // Decrement until we find the largest factor <= sqrt(area)
        while (area % w != 0) {
            w--;
        }
        
        // The first match is guaranteed to have the minimal difference (L - W)
        return new int[]{area / w, w};
    }
}