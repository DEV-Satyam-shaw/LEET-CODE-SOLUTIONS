class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] freq = new boolean[128];
        for(int i = 0; i < jewels.length(); i++)
        {
            char ch = jewels.charAt(i);
            freq[(int)ch] = true;
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++)
        {
            char ch = stones.charAt(i);
            if(freq[(int)ch] == true) count++;
        }
        return count;
    }
}