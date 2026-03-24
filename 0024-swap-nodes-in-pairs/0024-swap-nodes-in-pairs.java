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
        if(head==null || head.next==null) return head;
        ListNode d=new ListNode(-1);
        d.next=head;
        ListNode p=d;
        while(head!=null && head.next!=null){
            ListNode f=head;
            ListNode s=head.next;
            p.next=s;
            f.next=s.next;
            s.next=f;
            p=f;
            head=f.next;
        }
        return d.next;

    }
}