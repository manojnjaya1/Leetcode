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
    public int goodNodes(TreeNode root) {
     return   countNodes(root,-100000);
    }
   int countNodes(TreeNode root,int count){
        if(root==null)return 0;
        int res=root.val>=count?1:0;
        res+=countNodes(root.left,Math.max(count,root.val));
         res+=countNodes(root.right,Math.max(count,root.val));
        return res;
    }
}