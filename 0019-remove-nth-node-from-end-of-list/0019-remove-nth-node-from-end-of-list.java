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
        // 1. Create a dummy node to handle cases like removing the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // 2. Move 'fast' pointer n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // 3. Move both pointers until 'fast' hits the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 4. 'slow' is now right before the node to be deleted
        slow.next = slow.next.next;

        return dummy.next;
    }
}