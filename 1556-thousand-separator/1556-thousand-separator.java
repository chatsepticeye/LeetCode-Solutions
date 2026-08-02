class Solution {
    public String thousandSeparator(int n) {
        return String.format(java.util.Locale.GERMANY, "%,d", n);
    }
}