class Solution {
    public int dayOfYear(String date) {
        // Split the string into year, month, and day components
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        // Days in each month for a normal year
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check if the current year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; // Update February to 29 days
        }
        
        int dayCount = 0;
        // Sum up the days of all previous months
        for (int i = 0; i < month - 1; i++) {
            dayCount += daysInMonth[i];
        }
        
        // Add the days passed in the current month
        dayCount += day;
        
        return dayCount;
    }
}