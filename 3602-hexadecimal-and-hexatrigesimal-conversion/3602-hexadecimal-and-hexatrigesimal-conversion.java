class Solution {
    public String concatHex36(int n) {
        // Use long to prevent overflow for n^2 and n^3
        long nSquared = (long) n * n;
        long nCubed = (long) n * n * n;

        // Convert n^2 to Hexadecimal (Base 16) and make it uppercase
        String hexPart = Long.toString(nSquared, 16).toUpperCase();

        // Convert n^3 to Hexatrigesimal (Base 36) and make it uppercase
        String base36Part = Long.toString(nCubed, 36).toUpperCase();

        // Return the concatenated result
        return hexPart + base36Part;
    }
}