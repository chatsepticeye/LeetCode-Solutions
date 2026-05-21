class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isSymmetric(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        
        // Condition: Odd length numbers can never be symmetric
        if (len % 2 != 0) {
            return false;
        }
        
        int n = len / 2;
        int leftSum = 0;
        int rightSum = 0;
        
        // Calculate the sum of the first n digits
        for (int i = 0; i < n; i++) {
            leftSum += str.charAt(i) - '0';
        }
        
        // Calculate the sum of the last n digits
        for (int i = n; i < len; i++) {
            rightSum += str.charAt(i) - '0';
        }
        
        return leftSum == rightSum;
    }
}