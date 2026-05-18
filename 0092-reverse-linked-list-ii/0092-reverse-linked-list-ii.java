class Solution {
    // 1. Declare the successor variable at the class level so both functions can see it
    ListNode successor = null; 

    private ListNode reverseFirstN(ListNode head, int n) {
        // Base Case: Instead of checking for null, we stop when n == 1
        if (n == 1) {
            successor = head.next; // Save the node that comes AFTER the reversal zone
            return head;
        }
        
        // 1. EXACTLY LIKE YOUR NOTEBOOK: Recurse down the list
        ListNode newhead = reverseFirstN(head.next, n - 1);
        
        // 2. EXACTLY LIKE YOUR NOTEBOOK: Flip the pointer backwards
        head.next.next = head;
        
        // 3. THE ONLY CHANGE: Instead of null, point to the saved successor
        head.next = successor; 
        
        return newhead;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        // If left == 1, we are at the start of the reversal zone! Use your notebook logic.
        if (left == 1) {
            return reverseFirstN(head, right);
        }
        
        // If left > 1, we just move forward, waiting for the returned sublist to link back up
        head.next = reverseBetween(head.next, left - 1, right - 1);
        
        return head;
    }
}