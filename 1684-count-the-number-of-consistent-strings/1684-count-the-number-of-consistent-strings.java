class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> bag= new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            bag.add(allowed.charAt(i));
        }
        int c=0;
        for(String word: words){
            boolean isconsistent= true;
            for(int j=0;j<word.length();j++){
                if(!bag.contains(word.charAt(j))){
                    isconsistent=false;
                    break;
                }

            }
            if(isconsistent){
                c++;
            }
        }
        return c;
    }
}