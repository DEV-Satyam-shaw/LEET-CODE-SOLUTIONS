class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> ans = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            ans.put(arr[i], ans.getOrDefault(arr[i],0)+1);
        }

        Set<Integer> occur = new HashSet<>(ans.values());
        return occur.size() == ans.size();
    }
}