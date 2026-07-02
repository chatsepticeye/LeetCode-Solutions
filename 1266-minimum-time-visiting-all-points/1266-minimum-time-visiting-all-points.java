class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        
        // Loop through the points sequentially
        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0], y1 = points[i][1];
            int x2 = points[i + 1][0], y2 = points[i + 1][1];
            
            // Calculate absolute difference on both axes
            int deltaX = Math.abs(x2 - x1);
            int deltaY = Math.abs(y2 - y1);
            
            // The time taken is simply the maximum of the two differences
            totalTime += Math.max(deltaX, deltaY);
        }
        
        return totalTime;
    }
}