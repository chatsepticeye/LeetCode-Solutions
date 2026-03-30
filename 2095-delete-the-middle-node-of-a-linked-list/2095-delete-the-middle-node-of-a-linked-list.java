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
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Step 1: Handle the edge case where the list has only one node
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Step 2: Move fast 2x as quick as slow
        while (fast != null && fast.next != null) {
            prev = slow;          // prev "shadows" slow
            slow = slow.next;     // slow moves 1 step
            fast = fast.next.next; // fast moves 2 steps
        }

        // Step 3: Delete the middle node
        // By now, slow is at the middle, and prev is right before it.
        prev.next = slow.next;

        return head;
    }
}