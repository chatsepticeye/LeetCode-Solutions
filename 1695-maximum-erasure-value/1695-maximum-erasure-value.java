class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      int maxsum=0;
      int mx=0;
      HashMap<Integer,Integer>map=new HashMap<>();
      int low=0;
      for(int high=0;high<nums.length;high++){
        int add=nums[high];
        map.put(add,map.getOrDefault(add,0)+1);
        maxsum+=add;
        while((high-low+1)-map.size()>0){
            int left=nums[low];
            maxsum-=left;
            map.put(left,map.get(left)-1);
                if (map.get(left) == 0) {
                    map.remove(left);
                }  
            low++;
        }
        mx=Math.max(mx,maxsum);      
      }  
      return mx;
    }
}
