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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode t1=head;
        ListNode d2=new ListNode(-1);
        ListNode t2=d2; 
        while( t1 !=null && t1.next!=null){
            ListNode even=t1.next;
            t2.next=even;
            t2=t2.next;
            t1.next=even.next;
            if (t1.next != null) {
            t1 = t1.next;
        }
    }
    t2.next=null;
    t1.next=d2.next;
    return head;
    }
}