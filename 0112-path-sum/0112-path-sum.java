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
    private boolean output = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return output;
        }
        tracking(root, targetSum, 0);
        return output;
    }

    private void tracking(TreeNode node, int targetSum, int currentSum) {
        if (output) {
            return;
        }

        currentSum += node.val;

        if (node.left == null && node.right == null) {
            if (targetSum == currentSum) {
                output = true;
            }
            return;
        }

        if (node.left != null) {
            tracking(node.left, targetSum, currentSum);
        }

        if (node.right != null) {
            tracking(node.right, targetSum, currentSum);
        }
    }
}