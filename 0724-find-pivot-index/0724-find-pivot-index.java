class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++){
           t+=nums[i];
        }
        int ls=0;
        for(int i=0;i<nums.length;i++){
            int rs=t-ls-nums[i];
            if(ls==rs){
                return i;
            }
            ls+=nums[i];
        }
          return  -1;
    }
}