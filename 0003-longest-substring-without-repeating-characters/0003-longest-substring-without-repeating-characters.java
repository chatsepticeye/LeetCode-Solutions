class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int low=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int res=Integer.MIN_VALUE;
        for(int high=0;high<s.length();high++){
            char a=s.charAt(high);
            map.put(a,map.getOrDefault(a,0)+1);
            
            while(map.size()<high-low+1){
                char left=s.charAt(low);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                low++;
            }
            res=Math.max(res,high-low+1);
           
        }
        return res;
    }
}