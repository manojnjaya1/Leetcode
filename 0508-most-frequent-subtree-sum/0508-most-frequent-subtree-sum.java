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
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        int maxi=0;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur=q.remove();
            if(cur==null)continue;
            int ans=sum(cur);
           // System.out.println(ans);
            if(map.containsKey(ans)){
                maxi=Math.max(maxi,map.get(ans));
            }
            map.put(ans,map.getOrDefault(ans,0)+1);
            q.add(cur.left);
            q.add(cur.right);
        }
        maxi+=1;
        List<Integer> li=new LinkedList<>();
        for(int key:map.keySet()){
            if(map.get(key)==maxi){
                li.add(key);
            }
        }
         int[] arr = new int[li.size()];
 
      
        for (int i = 0; i < li.size(); i++)
            arr[i] = li.get(i);
        return arr;
    
    }
    
    int sum(TreeNode root){
        if(root==null)return 0;
     
        return  root.val+sum(root.left) + sum(root.right);
    }
}