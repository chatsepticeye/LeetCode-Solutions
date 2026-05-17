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
       int  s1=0;
        int s2=0;
        ListNode t1=h1;
        ListNode t2=h2;
        while(t1!=null){
           t1= t1.next;
            s1++;
        }
        while(t2!=null){
           t2= t2.next;
            s2++;
        }
        t1=h1;
        t2=h2;
        int d=Math.abs(s1-s2);
        if(s1>s2){
            for(int i=0;i<d;i++) t1=t1.next;
        }
        else{
            for(int i=0;i<d;i++) t2=t2.next;
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;


    }
}