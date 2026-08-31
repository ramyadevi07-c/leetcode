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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return checksymmetric(root.left,root.right);
    }
    public boolean checksymmetric(TreeNode l1,TreeNode r1){
        if(l1==null && r1 == null){
            return true;
        }
        if(l1==null||r1 == null){
            return false;
        }
        if(l1.val != r1.val){
            return false;
        }
        return checksymmetric(l1.left,r1.right)&& checksymmetric(l1.right,r1.left);
    }
}