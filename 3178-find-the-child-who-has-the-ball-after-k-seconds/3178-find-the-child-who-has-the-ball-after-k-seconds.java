class Solution {
    public int numberOfChild(int n, int k) {
        // A single one-way trip (from 0 to n-1 or n-1 to 0) takes n-1 steps
        int tripLength = n - 1;
        
        // Calculate how many full one-way trips were completed
        int fullTrips = k / tripLength;
        
        // Calculate the remaining steps in the current (incomplete) trip
        int remSteps = k % tripLength;
        
        // If fullTrips is even, the ball is currently moving Right (from index 0)
        // If fullTrips is odd, the ball is currently moving Left (from index n-1)
        if (fullTrips % 2 == 0) {
            return remSteps;
        } else {
            return tripLength - remSteps;
        }
    }
}