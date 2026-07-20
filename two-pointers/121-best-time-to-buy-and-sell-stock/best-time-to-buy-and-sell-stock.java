class Solution {
    public int maxProfit(int[] prices) {
        int mip=prices[0];
        int maxp=0,p=0;
    
    for(int i=1;i<prices.length;i++){
        if(prices[i]<mip){
            mip=prices[i];
        }
     p=prices[i]-mip;

        if(p>maxp){
        maxp=p;
           }       }            
        return maxp;
        
    
}}