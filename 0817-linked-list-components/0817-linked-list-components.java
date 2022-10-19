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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        // HashSet<String> s=new HashSet<>(Arrays.asList(words));
        ListNode temp=head;
        int ans=0;
         int cont=0;
        while(temp!=null){
            if(s.contains(temp.val)){
                cont++;
            }else{
                if(cont>0){
                    ans++;
                    cont=0;
                }
            }
            temp=temp.next;
        }
        if(cont>0)ans++;
        return ans;
    }
}