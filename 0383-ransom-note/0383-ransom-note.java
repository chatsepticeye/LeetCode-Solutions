class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c= magazine.charAt(i);
            int cnt=mpp.getOrDefault(c,0);
            mpp.put(c,cnt+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(!mpp.containsKey(c)) return false;
            int cnt=mpp.get(c);
            mpp.put(c,cnt-1);
            if(mpp.get(c)<0) return false;

        }
        return true;
    }
}