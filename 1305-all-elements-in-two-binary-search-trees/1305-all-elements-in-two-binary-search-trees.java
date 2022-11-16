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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> li=new ArrayList<>();
        solve(root1,li);
        solve(root2,li);
        Collections.sort(li);
        return li;
    }
    void solve(TreeNode root,ArrayList<Integer> li){
        if (root == null)
            return;
 
       
     solve(root.left,li);
 
        
        li.add(root.val);
 solve(root.right,li);
 
        
    }
}