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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        ListNode p = dummy ;
        ListNode c = head;
        if(head == null ){
            return head;
        }
        ListNode n = head.next;
        if(n == null){
            return head;
        }

        while(c != null && c.next!= null){
            c.next = n.next;
            n.next= c;
            p.next=n;
            p=c;
            if(c.next!=null){
            c=c.next;
            }
            n=c.next;
        }
        return dummy.next;
    }
}
