/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head==null)return null;
        ListNode meet=hasCycle(head);
        if(meet==null)return null;
         ListNode temp=head;
        
        while(temp!=meet){
            temp=temp.next;
            meet=meet.next;
        }
        return temp;
        
    }
      ListNode hasCycle(ListNode head) {
        if(head==null)return null;
         ListNode slow=head;
         ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return slow;
        }
        return null;
    }
}