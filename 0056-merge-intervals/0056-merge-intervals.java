class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>result= new ArrayList<>();
        int [] current=intervals[0];
        result.add(current);
        for(int[] interval:intervals){
            int currentend=current[1];
            int nextstart=interval[0];
            int nextend=interval[1];
            if(currentend>=nextstart){
                current[1]=Math.max(currentend,nextend);
               }
            else{
                current=interval;
                result.add(current);
            }


            
        }
        return result.toArray(new int[result.size()][]);
    }
       
        
}
