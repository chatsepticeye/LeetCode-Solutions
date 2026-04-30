class Solution {
    public int passThePillow(int n, int time) {
        // The number of steps to go from one end to the other
        int length = n - 1;
        
        // How many full trips have been completed
        int fullPasses = time / length;
        
        // The remaining steps after the last full trip
        int extraTime = time % length;

        if (fullPasses % 2 == 0) {
            // Even passes: moving forward from 1
            return 1 + extraTime;
        } else {
            // Odd passes: moving backward from n
            return n - extraTime;
        }
    }
}