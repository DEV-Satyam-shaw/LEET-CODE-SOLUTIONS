class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int diff = Integer.MAX_VALUE;

        for(int i = 1; i <= Math.sqrt(area); i++){
            if(area % i == 0){
                int div = area / i;
                int currdiff = div - i;
                if(currdiff < diff){
                    ans[0] = div; ans[1] = i;
                    diff = currdiff;
                }
            }
        }
        return ans;
    }
}