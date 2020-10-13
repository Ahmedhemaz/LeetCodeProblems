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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(key > root.val) {
            root.right = deleteNode(root.right, key);
        }else if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            // if node is leaf
            if(this.isLeaf(root)) {
                return null;
            }
            // if node has one child
            if(hasOneChild(root)) {
                if(root.left == null) return root.right;
                if(root.right == null) return root.left;
            }
            // if node has two childs
            // find successor
            // swap root.data to successsor data
            // deleteNode from root.left
            TreeNode successor = this.getSuccessor(root);
            root.val = successor.val;
            root.left = deleteNode(root.left, root.val);
            
        }
        return root;
    }
    
    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
    private boolean hasOneChild(TreeNode node) {
        return node.left != null || node.right != null;
    }
    private TreeNode getSuccessor(TreeNode node) {
        node = node.left;
        while(node.right != null) {
            node = node.right;
        }
        return node;
    }
    
}
