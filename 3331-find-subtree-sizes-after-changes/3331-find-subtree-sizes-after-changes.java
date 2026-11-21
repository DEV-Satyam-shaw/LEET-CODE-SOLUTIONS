class Solution {
    private List<Integer>[] adj;
    private int[] newParent;
    private int[] lastSeen;
    private int[] ans;
    private String s;

    @SuppressWarnings("unchecked")
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        this.s = s;
        this.newParent = parent.clone();
        this.lastSeen = new int[26];
        this.ans = new int[n];
        
        Arrays.fill(lastSeen, -1);

        // 1. Build the initial adjacency list
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
        }

        // 2. First DFS: Find the closest ancestor with the same character
        dfsReassign(0);

        // 3. Rebuild the tree with updated parent pointers
        for (int i = 0; i < n; i++) {
            adj[i].clear();
        }
        for (int i = 1; i < n; i++) {
            adj[newParent[i]].add(i);
        }

        // 4. Second DFS: Calculate final subtree sizes
        dfsCount(0);

        return ans;
    }

    private void dfsReassign(int u) {
        int charIdx = s.charAt(u) - 'a';
        int prevAncestor = lastSeen[charIdx];

        // If an ancestor with the same character exists, reassign u's parent
        if (prevAncestor != -1) {
            newParent[u] = prevAncestor;
        }

        // Set current node as the most recent ancestor for this character
        lastSeen[charIdx] = u;

        for (int v : adj[u]) {
            dfsReassign(v);
        }

        // Backtrack: restore the previous ancestor before leaving this subtree
        lastSeen[charIdx] = prevAncestor;
    }

    private int dfsCount(int u) {
        int size = 1;
        for (int v : adj[u]) {
            size += dfsCount(v);
        }
        ans[u] = size;
        return size;
    }
}