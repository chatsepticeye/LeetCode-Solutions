class Solution {
    public boolean canWinNim(int n) {
        // If n is NOT divisible by 4, you win.
        return n % 4 != 0;
    }
}