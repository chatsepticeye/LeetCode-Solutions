

class Solution {
    public int[]decimalRepresentation(int n) {
        // Convert number to string to iterate through digits
        String s = Integer.toString(n);
        List<Integer> components = new ArrayList<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            // Convert char digit to integer
            int digit = s.charAt(i) - '0';

            // Only process non-zero digits as base-10 components
            if (digit != 0) {
                // Calculate the power of 10 based on the digit's position
                // Position is (length - 1 - i)
                int multiplier = (int) Math.pow(10, length - 1 - i);
                components.add(digit * multiplier);
            }
        }

        // Convert the List to a primitive int array
        int[] result = new int[components.size()];
        for (int i = 0; i < components.size(); i++) {
            result[i] = components.get(i);
        }

        return result;
    }
}