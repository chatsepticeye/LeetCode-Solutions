class Solution {
    public int countBeautifulPairs(int[] nums) {
        int beautifulPairsCount = 0;
        int[] firstDigitFreq = new int[10]; // Stores frequency of first digits seen so far
        
        for (int num : nums) {
            int lastDigit = num % 10;
            
            // Look backward: check which previously seen first digits are coprime with the current last digit
            for (int fd = 1; fd <= 9; fd++) {
                if (firstDigitFreq[fd] > 0 && gcd(fd, lastDigit) == 1) {
                    beautifulPairsCount += firstDigitFreq[fd];
                }
            }
            
            // Extract the first digit of the current number
            int firstDigit = num;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            
            // Record the current first digit for future pairs
            firstDigitFreq[firstDigit]++;
        }
        
        return beautifulPairsCount;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}