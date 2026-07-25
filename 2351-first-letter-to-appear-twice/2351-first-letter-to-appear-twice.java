class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character>seen=new HashSet<>();
        for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
            if(!seen.add(c)){
                return c;
            }
        }
        return ' ';

    }
}