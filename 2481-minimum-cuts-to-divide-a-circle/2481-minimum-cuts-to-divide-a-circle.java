class Solution {
    public int numberOfCuts(int n) {
        // Case 1: No cuts needed for a single piece
        if (n == 1) {
            return 0;
        }
        
        // Case 2: Even pieces leverage diameter cuts
        if (n % 2 == 0) {
            return n / 2;
        }
        
        // Case 3: Odd pieces require individual radius cuts
        return n;
    }
}