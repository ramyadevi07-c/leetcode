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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null){
            return list;
        }
        que.offer(root);
        while(!que.isEmpty()){
            double sum = 0;
            int quesize = que.size();
            for(int i=0;i<quesize;i++){
                TreeNode currnode = que.poll();
                sum=sum + currnode.val;
                if(currnode.left!=null){
                    que.offer(currnode.left);
                }
                if(currnode.right!=null){
                    que.offer(currnode.right);
                }
            }
            list.add(sum/quesize);
        }
        return list;
    }
}