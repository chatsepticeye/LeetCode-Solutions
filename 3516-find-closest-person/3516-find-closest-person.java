class Solution {
    public int findClosest(int x, int y, int z) {
        // Calculate the absolute distance for both people
        int distance1 = Math.abs(x - z);
        int distance2 = Math.abs(y - z);
        
        // Compare distances and return the corresponding result
        if (distance1 < distance2) {
            return 1;
        } else if (distance2 < distance1) {
            return 2;
        } else {
            return 0;
        }
    }
}