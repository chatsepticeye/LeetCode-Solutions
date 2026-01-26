class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int currsum=0;
        int minlen=Integer.MAX_VALUE;
        for(int high=0; high<nums.length;high++){
            currsum+=nums[high];
             while(currsum>=target){
                minlen=Math.min(minlen,high-low+1);
                 currsum-=nums[low];
                  low++;
                  }
        }
        return(minlen==Integer.MAX_VALUE) ? 0:minlen;
    }

}