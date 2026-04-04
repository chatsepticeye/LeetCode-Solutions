class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        // Step 1: Create 'buckets' for the digit sums. 
        // Max sum for 99,999 is 45, so size 50 is safe.
        int[] boxes = new int[50];
        int maxBalls = 0;

        // Step 2: Iterate through every ball from low to high
        for (int i = lowLimit; i <= highLimit; i++) {
            int currentBall = i;
            int digitSum = 0;

            // Step 3: Calculate digit sum
            while (currentBall > 0) {
                digitSum += currentBall % 10;
                currentBall /= 10;
            }

            // Step 4: Put ball in box and update the maximum
            boxes[digitSum]++;
            if (boxes[digitSum] > maxBalls) {
                maxBalls = boxes[digitSum];
            }
        }

        return maxBalls;
    }
}