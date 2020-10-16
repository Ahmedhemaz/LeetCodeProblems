/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        return this.isSymmertricHelper(root.left, root.right);
    }

    private boolean isSymmertricHelper(TreeNode leftChild, TreeNode rightChild) {
        if (rightChild == null && leftChild == null)
            return true;
        if (leftChild == null || rightChild == null && leftChild != rightChild)
            return false;
        if (leftChild.val != rightChild.val)
            return false;
        return this.isSymmertricHelper(leftChild.left, rightChild.right)
                && this.isSymmertricHelper(leftChild.right, rightChild.left);
    }
}