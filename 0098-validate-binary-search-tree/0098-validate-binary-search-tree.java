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
    public boolean isValidBST(TreeNode root) {
      return inorder(root);  
    }
    TreeNode prev = null;
    public boolean inorder(TreeNode node){
        if(node==null){
            return true;
        }
        if(inorder(node.left)==false){
            return false;
        }
        if(prev !=null && node.val <= prev.val){
            return false;
        }
        prev = node;
        return inorder(node.right);
    }
}