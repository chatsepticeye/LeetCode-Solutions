class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int currp=0;
        for(int i=1;i<prices.length;i++){
            int change=prices[i]-prices[i-1];
            currp+=change;
            maxp=Math.max(currp,maxp);
        
        if(currp<0){
            currp=0;
        }
        }
        return maxp;

    }
}