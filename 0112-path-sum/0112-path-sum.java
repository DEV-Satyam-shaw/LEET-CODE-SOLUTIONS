/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
        if(root == null) return false;
        return backtrack(root,targetSum,0);
    }
        private boolean backtrack(TreeNode node, int targetSum, int currsum)
        {
            currsum += node.val;

            if(node.right == null && node.left == null && currsum == targetSum){
                return true;
            }

            if(node.left != null && backtrack(node.left, targetSum, currsum)){
                return true;
            }

            if(node.right != null && backtrack(node.right, targetSum, currsum)){
                return true;
            }
            return false;
        }

        // Stack<TreeNode> nodestack = new Stack<>();
        // Stack<Integer> sumstack = new Stack<>();

        // nodestack.push(root);
        // sumstack.push(targetSum - root.val);

        // while(!nodestack.isEmpty())
        // {
        //     TreeNode curr = nodestack.pop();
        //     int currsum = sumstack.pop();

        //     if(curr.right == null && curr.left == null && currsum == 0){
        //         return true;
        //     }

        //     if(curr.right != null){
        //         nodestack.push(curr.right);
        //         sumstack.push(currsum - curr.right.val);
        //     }

        //     if(curr.left != null){
        //         nodestack.push(curr.left);
        //         sumstack.push(currsum - curr.left.val);
        //     }
        // }
}