class Solution {
    public char kthCharacter(int k) {
        // Convert to 0-indexed value
        int targetIndex = k - 1;
        
        // Count how many times this position has been transformed/shifted
        int shiftCount = Integer.bitCount(targetIndex);
        
        // Compute the resulting character wrapping around the alphabet
        return (char) ('a' + (shiftCount % 26));
    }
}