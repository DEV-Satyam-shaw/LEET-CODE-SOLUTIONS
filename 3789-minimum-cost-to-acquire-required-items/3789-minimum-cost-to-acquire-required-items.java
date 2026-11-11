class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1;
        long c2 = cost2;
        long cb = costBoth;
        long n1 = need1;
        long n2 = need2;

        long option1 = c1*n1 + c2*n2;

        long option2 = Math.max(n1, n2) * cb;

        long minNeed = Math.min(n1,n2);
        long option3 = minNeed * cb + (n1-minNeed) * c1 + (n2 - minNeed) * c2; 

        return Math.min(option1, Math.min(option2, option3));
    }
}