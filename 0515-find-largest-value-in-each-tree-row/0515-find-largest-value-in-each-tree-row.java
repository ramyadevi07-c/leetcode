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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null){
            return list;
        }
        que.offer(root);
        while(!que.isEmpty()){
            int quesize = que.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<quesize;i++){
                TreeNode currnode =que.poll(); 
                max= Math.max(max,currnode.val);
                if(currnode.left!=null){
                    que.offer(currnode.left);
                }
                if(currnode.right!=null){
                    que.offer(currnode.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}