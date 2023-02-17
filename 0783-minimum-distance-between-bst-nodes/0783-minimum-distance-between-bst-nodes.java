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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        inorder(root,li);
        
        int n=li.size();
        int mi=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            mi=Math.min(mi,li.get(i+1)-li.get(i));
        }
        return  mi;
    }
    
    void inorder(TreeNode root, ArrayList<Integer> li){
        if(root==null)return ;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
    }
}