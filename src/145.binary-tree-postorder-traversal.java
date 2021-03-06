/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
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
    List<Integer> result = new ArrayList<>();

    public void traversal(TreeNode root) {
        if (root == null) return;
        traversal(root.left);
        traversal(root.right);
        result.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return result;
    }
}
// @lc code=end
