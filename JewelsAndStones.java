import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> bag = new HashSet<>();
        
       
        for(int i = 0; i < jewels.length(); i++){
            bag.add(jewels.charAt(i));
        }
        
        
        int count = 0;
        for(int j = 0; j < stones.length(); j++){
            if(bag.contains(stones.charAt(j))) {
                count++;
            }
        }
        return count;
    }
}
