class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1; // Fix 1: Correct length and 0-based index

        while (i < j) { // Note: i < j is enough, no need for i <= j because a single middle char is always equal to itself
            
            // Skip non-alphanumeric characters from the left
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            
            // Skip non-alphanumeric characters from the right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            // Fix 2: Use .charAt() and convert to lowercase to ignore casing
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            // Move pointers inward after a successful match
            i++;
            j--;
        }
        return true;
    }
}