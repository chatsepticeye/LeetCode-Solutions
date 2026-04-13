class Solution {
    public int numPrimeArrangements(int n) {
        int countPrime = countPrimes(n);
        int countNonPrime = n - countPrime;
        
        long mod = 1_000_000_007;
        
        // Calculate (countPrime! * countNonPrime!) % mod
        long result = (factorial(countPrime, mod) * factorial(countNonPrime, mod)) % mod;
        
        return (int) result;
    }
    
    // Helper to count primes up to n using Sieve or simple check
    private int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    // Helper to calculate factorial modulo m
    private long factorial(int n, long mod) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % mod;
        }
        return fact;
    }
}