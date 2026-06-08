class Solution {
    public int numberOfMatches(int n) {
        int totalMatches = 0;
        
        while (n > 1) {
            if (n % 2 == 0) {
                totalMatches += n / 2;
                n = n / 2;         // Half the teams advance
            } else {
                totalMatches += (n - 1) / 2;
                n = ((n - 1) / 2) + 1; // The remainder + 1 random team advance
            }
        }
        
        return totalMatches;
    }
}