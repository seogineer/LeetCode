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
    private static int maxDepth;
    
    public int maxDepth(TreeNode root) {
        maxDepth = 0;
        binaryTreeExplore(root, 1);
        return maxDepth;
    }
    
    private void binaryTreeExplore(TreeNode treeNode, int depth){
        if(treeNode == null){
            if(maxDepth < depth - 1)
                maxDepth = depth - 1;
            return;
        }
        
        binaryTreeExplore(treeNode.left, depth + 1);
        binaryTreeExplore(treeNode.right, depth + 1);
    }
}