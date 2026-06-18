import java.util.*;

class Solution {
    public double minAreaFreeRect(int[][] points) {
        int n = points.length;
        double minArea = Double.MAX_VALUE;
        
        // Key: "midX,midY,squaredLength" -> Value: List of point indices pairs sharing this diagonal
        Map<String, List<int[]>> map = new HashMap<>();
        
        // 1. Iterate through all pairs of points (Diagonals)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long x1 = points[i][0], y1 = points[i][1];
                long x2 = points[j][0], y2 = points[j][1];
                
                // Calculate squared length of the diagonal
                long squaredLength = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
                
                // Calculate midpoint (Multiply by 2 or leave as decimals, keeping sum prevents precision loss)
                double midX = (x1 + x2) / 2.0;
                double midY = (y1 + y2) / 2.0;
                
                // Create a unique identifier key for this diagonal state
                String key = midX + "," + midY + "," + squaredLength;
                
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                
                // 2. If other diagonals share this state, calculate areas
                for (int[] prevPair : map.get(key)) {
                    int p1_idx = prevPair[0];
                    // We can use points[i], points[j], and points[p1_idx] to get our 3 vertices
                    double side1 = Math.sqrt((points[i][0] - points[p1_idx][0]) * (points[i][0] - points[p1_idx][0]) + 
                                             (points[i][1] - points[p1_idx][1]) * (points[i][1] - points[p1_idx][1]));
                                             
                    double side2 = Math.sqrt((points[j][0] - points[p1_idx][0]) * (points[j][0] - points[p1_idx][0]) + 
                                             (points[j][1] - points[p1_idx][1]) * (points[j][1] - points[p1_idx][1]));
                    
                    double area = side1 * side2;
                    minArea = Math.min(minArea, area);
                }
                
                // Store the current pair indices under this diagonal signature
                map.get(key).add(new int[]{i, j});
            }
        }
        
        return minArea == Double.MAX_VALUE ? 0.0 : minArea;
    }
}