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
    public TreeNode sortedArrayToBST(int[] nums) {
        return binaryTreeBuilder(nums, 0, nums.length - 1);
    }
    
    private TreeNode binaryTreeBuilder(int[] nums, int start, int end){
        if(end < start){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode tn = new TreeNode(nums[mid]);
        tn.left = binaryTreeBuilder(nums, start, mid - 1);
        tn.right = binaryTreeBuilder(nums, mid + 1, end);
        return tn;
    }
}