class Solution {
    public long sumAndMultiply(int n) {
        int n1 = n;
        int sum = 0;
        
        // 1. Calculate Sum of Digits
        while (n1 != 0) {
            int r = n1 % 10;
            sum += r; // Fixed: add the digit 'r', not the whole number 'n1'
            n1 = n1 / 10;
        }

        // 2. Remove zeros from the number
        String s = String.valueOf(n); // Convert int to String
        String l = ""; // Initialize as empty string
        
        for (int i = 0; i < s.length(); i++) {
            // Check if character is not '0'
            if (s.charAt(i) != '0') { 
                l += s.charAt(i);
            }
        }

        // Handle case where the number becomes empty (like if input was 0)
        if (l.equals("")) return 0;

        // 3. Convert the "no-zero" string back to a number
        int n2 = Integer.parseInt(l);
        
        // Return result (using long to prevent overflow)
        return (long) n2 * sum;
    }
}