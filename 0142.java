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
        
        ListNode slow = head;
        ListNode fast = head;
        int flag =0;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag =1;
                break;
            }
        }
        slow=head;
        if(flag==1){
            while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
        }
        else {
            return null;
        }
        
    }
}
