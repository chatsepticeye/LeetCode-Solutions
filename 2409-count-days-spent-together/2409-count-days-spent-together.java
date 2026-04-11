class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Convert all dates to "Day of the Year" integers
        int aStart = dateToDay(arriveAlice, daysInMonth);
        int aEnd = dateToDay(leaveAlice, daysInMonth);
        int bStart = dateToDay(arriveBob, daysInMonth);
        int bEnd = dateToDay(leaveBob, daysInMonth);

        // Find the intersection of the two date ranges
        int startOverlap = Math.max(aStart, bStart);
        int endOverlap = Math.min(aEnd, bEnd);

        // If end is less than start, there is no overlap
        return Math.max(0, endOverlap - startOverlap + 1);
    }

    private int dateToDay(String date, int[] daysInMonth) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        
        int totalDays = 0;
        // Sum days of all months prior to the current month
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        
        return totalDays + day;
    }
}