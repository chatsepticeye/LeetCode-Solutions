class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int maxlen=0;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum+=(nums[i]==1)?1:-1;
            if(map.containsKey(currsum)){
                maxlen=Math.max(maxlen,i-map.get(currsum));
            }
            else{
                map.put(currsum,i);
        }
    }
     return maxlen;
     }
}