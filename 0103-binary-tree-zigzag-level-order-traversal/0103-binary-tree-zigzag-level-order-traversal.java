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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        if(root==null)return ans;
        boolean leftToRight=true;
        que.offer(root);
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=que.poll();
                if(leftToRight)li.add(temp.val);
                else li.add(0,temp.val);
                
                if(temp.left!=null)que.offer(temp.left);
                if(temp.right!=null)que.offer(temp.right);
                
            }
            ans.add(li);
            leftToRight=!leftToRight;
        }
        return ans;
    }
}