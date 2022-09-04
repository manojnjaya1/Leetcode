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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return solve(nums,0,nums.length-1) ;
    }
    TreeNode solve(int[] nums,int start,int end){
        if(end<start)return null;
        int max=-1;
        int ind=-1;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max=nums[i];
                ind=i;
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=solve(nums,start,ind-1);
        root.right=solve(nums,ind+1,end);
        return root;
    }
}