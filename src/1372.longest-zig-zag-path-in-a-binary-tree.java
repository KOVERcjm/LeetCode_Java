/*
 * @lc app=leetcode id=1372 lang=java
 *
 * [1372] Longest ZigZag Path in a Binary Tree
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
    public int max = 0;

    public void count(TreeNode root, boolean direction, int count) {          // true for left and false for right
        max = Math.max(max, count);

        if (root.left != null)
            count(root.left, true, direction ^ true ? count + 1 : 1);
        if (root.right != null)
            count(root.right, false, direction ^ false ? count + 1 : 1);
    }

    public int longestZigZag(TreeNode root) {
        count(root, true, 0);
        count(root, false, 0);
        return max;
    }
}
// @lc code=end
