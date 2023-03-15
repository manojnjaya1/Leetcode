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
    public boolean isCompleteTree(TreeNode root) {
         int size = 0;
        int maxVal = -1;

        Queue<TreeNode> q = new ArrayDeque<>();
        root.val = 0;
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            size++;
            maxVal = Math.max(maxVal, node.val);

            if(node.left != null){
                node.left.val = 2*node.val+1;
                q.offer(node.left);
            }
            if(node.right != null){
                node.right.val = 2*node.val+2;
                q.offer(node.right);
            }
        }

        return maxVal == size-1;
    }
}