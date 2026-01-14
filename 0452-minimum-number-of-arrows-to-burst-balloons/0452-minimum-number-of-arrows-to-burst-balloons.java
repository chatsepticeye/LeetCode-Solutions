class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int currentend=points[0][1];
        int arrows=1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]>currentend){
                arrows++;
                currentend=points[i][1];
            }
        }
        return arrows;

        
    }
}