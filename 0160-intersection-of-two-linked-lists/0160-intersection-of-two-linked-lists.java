/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1=0;
        int s2=0;
        ListNode t1=headA,t2=headB;
        while(t1!=null){
            s1++;
            t1=t1.next;
        }
        while(t2!=null){
            s2++;
            t2=t2.next;
        }
        t1=headA;
        t2=headB;
        int d=Math.abs(s1-s2);
        if(s1>s2){
            for(int i=0;i<d;i++) t1=t1.next;
        }
        else{
             for(int i=0;i<d;i++) t2=t2.next;
        }
        while(t1!=t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}