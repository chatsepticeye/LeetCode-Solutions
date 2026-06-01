import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> mpp = new HashMap<>();
        int minSum = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        
        for(int i=0; i<list1.length; i++){
           mpp.put(list1[i], i);
        }
        
        for(int i=0; i<list2.length; i++){
            String currentWord = list2[i];
            
            if(mpp.containsKey(currentWord)){
                int sum = mpp.get(currentWord) + i;
                
                if (sum < minSum) {
                    minSum = sum;
                    res.clear();
                    res.add(currentWord);
                }
                else if (sum == minSum) {
                    res.add(currentWord);
                }
            }
        }
        
        // Convert our dynamic list back to a standard String Array for LeetCode
        return res.toArray(new String[0]);
    }
}