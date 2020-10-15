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

/**
 * with inorder traversal we can have sorted elementes in ascending order so if
 * we validated the elementes are really sorted then it's a BST
 */
class Solution {

    public boolean isValidBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        this.inOrderTraversal(root, arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) <= arr.get(i)) {
                return false;
            }

        }
        return true;
    }

    /**
     * left-> root -> right
     */
    private void inOrderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;
        inOrderTraversal(root.left, arr);
        arr.add(root.val);
        inOrderTraversal(root.right, arr);
    }
}