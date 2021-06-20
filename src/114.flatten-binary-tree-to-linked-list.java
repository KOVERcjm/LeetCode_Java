/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
 */

// @lc code=start
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
        if (root == null || (root.left == null && root.right == null)) return;

        flatten(root.left);
        flatten(root.right);

        if (root.left == null) return;
        
        TreeNode p = root.left;
        while (null != p.right)
            p = p.right;
        
        p.right = root.right;
        root.right = root.left;
        root.left = null;
    }
}
// @lc code=end
