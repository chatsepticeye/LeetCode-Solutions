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
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        int l1=0;
        ListNode t1=h1;
        while(t1!=null){
            t1=t1.next;
            l1++;
        }
        int l2=0;
        ListNode t2=h2;
        while(t2!=null){
            t2=t2.next;
            l2++;
        }
        t1=h1;
        t2=h2;
        if(l1>l2){
            for(int i=0;i<l1-l2;i++) t1=t1.next;
        }
        else{
            for(int i=0;i<l2-l1;i++) t2=t2.next;

        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;

    }
}