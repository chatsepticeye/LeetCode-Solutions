class Solution {
    public int dayOfYear(String date) {
        String[] parts=date.split("-");
        int year=Integer.parseInt(parts[0]);
        int months=Integer.parseInt(parts[1]);
        int day=Integer.parseInt(parts[2]);
        int[] daysinmonth={31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%400==0) || (year%4==0 && year%100!=0)){
            daysinmonth[1]=29;
        }
        int totaldays=0;
        for(int i=0;i<months-1;i++){
            totaldays+=daysinmonth[i];

        }
        return totaldays+day;


    }
}