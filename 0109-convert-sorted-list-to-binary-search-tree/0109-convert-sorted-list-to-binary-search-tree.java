/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return binary(head,null);
    }
    TreeNode binary(ListNode start,  ListNode end){
        if( start==end)return  null;
         ListNode slow=start;
         ListNode fast=start;
        while(fast!=end && fast.next!=end){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode root=new TreeNode(slow.val);
        
        root.left=binary(start,slow);
        root.right=binary(slow.next,end);
        return root;
    }
   
}