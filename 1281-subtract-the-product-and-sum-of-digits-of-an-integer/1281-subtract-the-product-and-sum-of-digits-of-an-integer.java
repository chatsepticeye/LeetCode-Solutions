class Solution {
    public int subtractProductAndSum(int n) {
        int n1=n;
        int s=0;
        int p=1;
        while(n!=0){
            int r=n%10;
            s+=r;
            p*=r;
            n=n/10;
           


        }
        return p-s;
    }
}