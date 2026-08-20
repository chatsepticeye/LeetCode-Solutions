class Solution {
    public int maxProduct(int[] nums) {
        int currmax=nums[0];
        int currmin=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            if(x<0){
                int t=currmax;
                currmax=currmin;
                currmin=t;
            }
            currmin=Math.min(x,currmin*x);
            currmax=Math.max(x,currmax*x);
            ans=Math.max(ans,currmax);

        }
        return ans;
    }
}