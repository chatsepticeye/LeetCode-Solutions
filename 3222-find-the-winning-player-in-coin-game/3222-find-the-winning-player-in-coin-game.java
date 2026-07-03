class Solution {
    public String winningPlayer(int x, int y) {
        // Each turn requires exactly 1 coin of 75 and 4 coins of 10
        int turns = Math.min(x, y / 4);
        
        // If the total turns are odd, Alice wins. Otherwise, Bob wins.
        if (turns % 2 != 0) {
            return "Alice";
        } else {
            return "Bob";
        }
    }
}