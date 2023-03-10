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
  ListNode head;
    int len=0;
    public Solution(ListNode head) {
        this.head=head;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
    }
    
    public int getRandom() {
        Random ran=new Random();
        int n=ran.nextInt(len);
        ListNode cur=head;
        for(int i=0;i<n;i++){
            cur=cur.next;
        }
        return cur.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */