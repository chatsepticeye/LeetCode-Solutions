class Solution {
    public int xorOperation(int n, int start) {
        int result=0;
       for(int i=0;i<n;i++){
        int c=start+2*i;
         result^=c;
         } 
         return result;
    }
}