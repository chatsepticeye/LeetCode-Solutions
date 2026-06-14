class Solution {
    public int getLeastFrequentDigit(int n) { // Fixed method name here
        n = Math.abs(n);
        int[] freq = new int[10];
        
        if (n == 0) {
            freq[0] = 1;
        }
        
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }
        
        int minFreq = Integer.MAX_VALUE;
        int resultDigit = -1;
        
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                resultDigit = i;
            }
        }
        
        return resultDigit;
    }
}