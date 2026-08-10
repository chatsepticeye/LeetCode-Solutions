class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int sum=0;
        for(char c:s.toCharArray()){
            if(c=='1') sum++;
        }
        int leftzeros=0;
        int rightones=sum;
        int max=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                leftzeros++;
            }
            else{
                rightones--;
            }
            int score=leftzeros+rightones;
            max=Math.max(score,max);
        }
        return max;
    }
}