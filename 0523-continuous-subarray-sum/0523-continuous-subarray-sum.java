class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>rindex=new HashMap<>();
        int sum=0;
        rindex.put(0, -1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int r=sum%k;
            if(rindex.containsKey(r)){
                if(i-rindex.get(r)>1){
                    return true;
                }
            }
                else{
                    rindex.put(r,i);
                }
        }
        return false;

    }
}