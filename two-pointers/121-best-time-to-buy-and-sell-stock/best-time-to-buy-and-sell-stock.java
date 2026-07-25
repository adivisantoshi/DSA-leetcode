class Solution {
    public int maxProfit(int[] prices) {
   int minp=prices[0];
   int maxp=0;
   for(int i=1;i<prices.length;i++){
    if(prices[i]<minp){
        minp=prices[i];
      
    }
    else{
        int p=prices[i]-minp;
        if(p>maxp)
        maxp=p;
    }
      }  
       
    return maxp;
}}