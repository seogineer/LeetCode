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
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        
        flatten(leftNode);
        flatten(rightNode);
        
        root.left = null;
        
        root.right = leftNode;
        TreeNode temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        temp.right = rightNode;
    }
}