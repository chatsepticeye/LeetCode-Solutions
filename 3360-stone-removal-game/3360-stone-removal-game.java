class Solution {
    public boolean canAliceWin(int n) {
        int stonesToRemove = 10;
        int completedTurns = 0;
        
        // Keep playing as long as the current player can take their required stones
        while (n >= stonesToRemove) {
            n -= stonesToRemove;   // Remove the stones from the pile
            stonesToRemove--;      // Next turn requires 1 less stone
            completedTurns++;      // Mark this turn as done
        }
        
        // If total completed turns is odd (1, 3, 5...), Alice made the last move.
        // That means Bob was the one left stranded, so Alice wins!
        return completedTurns % 2 != 0;
    }
}