class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        } 
        int d=0;
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            d+=Math.abs(map.get(c)-i);
        } 
        return d;
        


    }
}