class Solution {
    public String convertDateToBinary(String date) {
        // Step 1: Split the date into [year, month, day]
        String[] parts = date.split("-");
        
        // Step 2: Convert each part to an integer
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        // Step 3: Convert integers to binary strings
        String yearBinary = Integer.toBinaryString(year);
        String monthBinary = Integer.toBinaryString(month);
        String dayBinary = Integer.toBinaryString(day);
        
        // Step 4: Combine them back using a String Joiner or simple concatenation
        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }
}