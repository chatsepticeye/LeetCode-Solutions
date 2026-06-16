class Solution {
    // Number of days in each month for a non-leap year
    private final int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDaysFromBaseline(date1) - getDaysFromBaseline(date2));
    }

    private int getDaysFromBaseline(String dateStr) {
        // Parse strings into year, month, and day integers
        String[] parts = dateStr.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int totalDays = 0;

        // 1. Add days for all years from 1971 up to (year - 1)
        for (int y = 1971; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        // 2. Add days for all months in the current year up to (month - 1)
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m];
            if (m == 2 && isLeapYear(year)) {
                totalDays += 1; // Extra day for February in leap year
            }
        }

        // 3. Add the days of the current month
        totalDays += day;

        return totalDays;
    }

    private boolean isLeapYear(int year) {
        // A year is a leap year if it's divisible by 4 but not by 100, unless it's divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}