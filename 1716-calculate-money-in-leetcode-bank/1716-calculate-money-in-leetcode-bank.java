class Solution {
    public int totalMoney(int n) {
        int t=0;
        int d=1;
        for(int i=0;i<n;i++){
            int week=i/7;
            int dayofweek=i%7;
            t+=week+dayofweek+d;
        }
        return t;
    }
}