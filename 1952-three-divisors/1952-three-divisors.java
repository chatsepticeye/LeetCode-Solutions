class Solution {
    public boolean isThree(int n) {
        // Find the integer square root of n
        int root = (int) Math.sqrt(n);
        
        // If it's not a perfect square, it can't have exactly 3 divisors
        if (root * root != n) {
            return false;
        }
        
        // Now check if 'root' is a prime number
        return isPrime(root);
    }
    
    // Helper method to check if a number is prime
    private boolean isPrime(int val) {
        if (val < 2) return false;
        
        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}