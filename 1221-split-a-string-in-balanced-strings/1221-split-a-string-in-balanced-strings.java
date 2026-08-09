class Solution {
    public int balancedStringSplit(String s) {
        int t=0;
        int bal=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='R') t+=1;
            else if(c=='L') t+=-1;
            if(t==0){
                bal+=1;
            }

        }
        return bal;
    }
}