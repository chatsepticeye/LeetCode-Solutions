import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        // Step 1: Map out the frequency count of each unique number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Iterate through the frequencies and look for any prime number
        for (int freq : freqMap.values()) {
            if (isPrime(freq)) {
                return true; // Return instantly if a prime frequency is encountered
            }
        }
        
        return false;
    }
    
    // Helper method to check if a number is prime in O(sqrt(n)) time
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}