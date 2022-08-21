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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return explore(0, 0, inorder.length - 1, preorder, inorder);
    }
    
    private TreeNode explore(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart > preorder.length - 1 || inStart > inEnd){
            return null;
        }
        
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        
        int inIndex = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(treeNode.val == inorder[i]){
                inIndex = i;
            }
        }
        
        treeNode.left = explore(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        treeNode.right = explore(preStart + (inIndex - inStart) + 1, inIndex + 1, inEnd, preorder, inorder);
        
        return treeNode;
    }
}