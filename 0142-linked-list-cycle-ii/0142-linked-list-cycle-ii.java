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
        // Edge case: Empty list or single node with no loop
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Phase 1: Detect if a cycle exists using our safe guardrails
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasCycle = true;
                break; // Collision found! Exit Phase 1
            }
        }

        // If the loop finished because it hit a null wall, no cycle exists
        if (!hasCycle) {
            return null;
        }

        // Phase 2: Reset slow to head, move both at speed 1 to find the entrance
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next; // Notice fast moves by 1 now, not 2!
        }

        return slow; // Both pointers now point to the start of the cycle
    }
}