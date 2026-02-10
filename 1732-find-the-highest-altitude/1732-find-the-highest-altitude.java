class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, current = 0;
        for (int g : gain) max = Math.max(max, current += g);
        return max;
    }
}