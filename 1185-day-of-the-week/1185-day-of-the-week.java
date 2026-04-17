class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDays = 0;
        
        // 1. Add days for all full years since 1971
        for (int i = 1971; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }
        
        // 2. Add days for all full months in the current year
        for (int i = 0; i < month - 1; i++) {
            totalDays += monthDays[i];
            // If it's February and current year is leap year, add 1 day
            if (i == 1 && isLeapYear(year)) {
                totalDays++;
            }
        }
        
        // 3. Add the days for the current month
        totalDays += day - 1;
        
        // Since Jan 1, 1971 is a Friday (index 5 in our Sunday-start array)
        // We shift by 5 to find the target day
        return days[(totalDays + 5) % 7];
    }
    
    private boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}