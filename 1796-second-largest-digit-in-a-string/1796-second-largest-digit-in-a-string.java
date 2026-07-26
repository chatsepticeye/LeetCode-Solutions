class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if character is a digit
            if (Character.isDigit(c)) {
                int digit = c - '0'; // Convert char '3' to int 3

                if (digit > first) {
                    second = first; // Old first becomes the new second
                    first = digit;  // Update largest digit
                } else if (digit < first && digit > second) {
                    second = digit; // Found a new second largest
                }
            }
        }

        return second;
    }
}