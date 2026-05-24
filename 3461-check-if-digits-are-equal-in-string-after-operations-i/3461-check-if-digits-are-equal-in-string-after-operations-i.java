class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int k = n - 2; // Number of operational layers to reduce
        
        int digit1 = 0;
        int digit2 = 0;
        
        // Pre-compute combination coefficients modulo 10 using prime factor counts of 2 and 5
        for (int i = 0; i <= k; i++) {
            int coeff = nCrMod10(k, i);
            
            digit1 = (digit1 + coeff * (s.charAt(i) - '0')) % 10;
            digit2 = (digit2 + coeff * (s.charAt(i + 1) - '0')) % 10;
        }
        
        return digit1 == digit2;
    }
    
    // Helper method to compute combination coefficients modulo 10 efficiently
    private int nCrMod10(int n, int r) {
        if (r < 0 || r > n) return 0;
        
        // We track prime counts of 2 and 5 to bypass division limitations in modulo arithmetic
        long num2 = 0, num5 = 0;
        long rem = 1;
        
        for (int i = 1; i <= r; i++) {
            int top = n - i + 1;
            int bot = i;
            
            while (top % 2 == 0) { top /= 2; num2++; }
            while (top % 5 == 0) { top /= 5; num5++; }
            
            while (bot % 2 == 0) { bot /= 2; num2--; }
            while (bot % 5 == 0) { bot /= 5; num5--; }
            
            // Multiply remaining factors using inverse modular arithmetic principles
            rem = (rem * top) % 10;
            rem = (rem * modularInverse(bot, 10)) % 10;
        }
        
        // Reconstruct the value with the extracted powers of 2 and 5
        long total = rem;
        for (int i = 0; i < num2; i++) total = (total * 2) % 10;
        for (int i = 0; i < num5; i++) total = (total * 5) % 10;
        
        return (int) total;
    }
    
    private int modularInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) return x;
        }
        return 1;
    }
}