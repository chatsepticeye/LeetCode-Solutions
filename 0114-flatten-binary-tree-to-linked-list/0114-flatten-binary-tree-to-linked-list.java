class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                // 1. Find the rightmost node in the left subtree
                TreeNode prev = curr.left;
                while (prev.right != null) {
                    prev = prev.right;
                }
                
                // 2. Connect the current right child to that rightmost node
                prev.right = curr.right;
                
                // 3. Move the left subtree to the right
                curr.right = curr.left;
                curr.left = null; // Important: The left must be null
            }
            // 4. Move to the next node on the right
            curr = curr.right;
        }
    }
}