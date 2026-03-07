class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // Get the initial change in x and y (the "base" slope)
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        
        for (int i = 2; i < coordinates.length; i++) {
            int curX = coordinates[i][0] - coordinates[i-1][0];
            int curY = coordinates[i][1] - coordinates[i-1][1];
            
            // Cross-multiply to check if slopes match: dy/dx == curY/curX
            if (dy * curX != dx * curY) {
                return false;
            }
        }
        return true;
    }
}