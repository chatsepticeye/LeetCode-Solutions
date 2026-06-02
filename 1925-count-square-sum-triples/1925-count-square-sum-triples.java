class Solution {
    public int countTriples(int n) {
        int count = 0;
        
        // Loop through all possible values of 'a'
        for (int a = 1; a <= n; a++) {
            // Loop through all possible values of 'b'
            for (int b = 1; b <= n; b++) {
                int cSquare = (a * a) + (b * b);
                int c = (int) Math.sqrt(cSquare);
                
                // Check if 'c' stays within bounds and is a perfect root match
                if (c <= n && c * c == cSquare) {
                    count++;
                }
            }
        }
        
        return count;
    }
}