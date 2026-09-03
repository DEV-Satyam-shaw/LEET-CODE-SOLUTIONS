class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> help = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i = n-1; i >= 0; i--)
        {
            while(!help.isEmpty() && temperatures[i] >= temperatures[help.peek()])
            {
                help.pop();
            }

            if(!help.isEmpty())
            {
                ans[i] = help.peek() - i;
            }
            help.push(i);
        }
        return ans;
    }
}