class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        
        // We only need to fill half the array with positive/negative pairs
        for (int i = 0; i < n / 2; i++) {
            // Use i + 1 to avoid adding zero twice
            int val = i + 1;
            result[i] = val;
            result[n - 1 - i] = -val;
        }
        
        // If n is odd, the middle element (at index n/2) 
        // will remain 0, which is the default for int[] in Java.
        return result;
    }
}