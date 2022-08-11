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
      return solve(root,Long.MIN_VALUE,Long.MAX_VALUE);
          
      
    }
     boolean solve(TreeNode root,long l,long h){
         if(root==null)return true;
         
         return root.val>l && root.val<h && solve(root.left,l,root.val)&& solve(root.right,root.val,h);
     }
}