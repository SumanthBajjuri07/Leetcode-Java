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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total=0;
        ListNode temp1 = head;
        if(head == null){
            return head;
        }
        if(head.next == null && n==1){
            return null;
        }
        if(head.next == null && n==0){
            return head;
        }

        while(temp1!=null){
            temp1 = temp1.next;
            total++;
        }

        ListNode p = head;
        if(total == n){
            p=p.next;
            head.next=null;
            head=p;
            return head;
        }

        System.out.println(total);
        
        ListNode temp2=head;
        int steps = total-n-1;
        while( steps >0){
            temp2=temp2.next;
            steps--;
        }

        if(temp2==null){
            return head;
        }
        

        ListNode del = temp2;
        del = del.next;
        if(del == null){
            return null;
        }
        else{
        temp2.next = del.next;
        }
        return head;
    }
}
