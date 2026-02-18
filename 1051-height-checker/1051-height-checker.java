class Solution {
    public int heightChecker(int[] heights) {
        // Step 1: Create a copy of the array
        int[] expected = heights.clone();
        
        // Step 2: Sort the copy (This is your "Target" arrangement)
        // You can use Arrays.sort() or your own Selection Sort here!
        Arrays.sort(expected);
        
        int count = 0;
        
        // Step 3: Compare Original vs. Expected
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        
        return count;
    }
}