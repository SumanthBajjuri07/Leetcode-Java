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
    public void reorderList(ListNode head) {
        ListNode midNode = mid(head);
        ListNode head2 = reverse(midNode.next);
        midNode.next=null;
        merge(head, head2);


    }

    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }



    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

    while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
    

    public void merge(ListNode l1, ListNode l2){
     while (l2 != null) {
      ListNode next = l1.next;
      l1.next = l2;
      l1 = l2;
      l2 = next;
    }
     
    }


    
    
}
