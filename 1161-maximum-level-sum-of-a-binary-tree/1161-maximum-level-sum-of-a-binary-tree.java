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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int level = 1;
        int maxlevel=level;
        int max=Integer.MIN_VALUE;
        while(!que.isEmpty()){
            int sum = 0;
            int quesize = que.size();
            for(int i=0;i<quesize;i++){
                TreeNode currnode = que.poll();
                sum = sum + currnode.val;
                if(currnode.left!=null){
                    que.offer(currnode.left);
                }
                if(currnode.right!=null){
                    que.offer(currnode.right);
                }
            }
            if(max<sum){
                    max = sum;
                    maxlevel = level;
                }
            level++;
        }
        return maxlevel;
    }
}