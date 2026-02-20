class Solution {
    public boolean squareIsWhite(String coordinates) {
        // 'a' is at index 1, 'b' is 2, etc.
        // Row is already a number.
        int column = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '0';
        
        // If the sum is odd, it's white.
        return (column + row) % 2 != 0;
    }
}