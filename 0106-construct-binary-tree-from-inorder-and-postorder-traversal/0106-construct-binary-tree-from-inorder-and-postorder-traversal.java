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
   int cur;
    Map<Integer, Integer> pos;

    private TreeNode postord(int[] inorder, int[] postorder, int l, int r) {
        if(l > r)
            return null;
        TreeNode root = new TreeNode(postorder[cur]);
        int ind = pos.get(root.val);
        cur--;
        root.right = postord(inorder, postorder, ind + 1, r);
        root.left = postord(inorder, postorder, l, ind - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        cur = len - 1;
        pos = new HashMap();
        for(int i = 0; i < len; i++)
            pos.put(inorder[i], i);
        return postord(inorder, postorder, 0, len - 1);
    }
}