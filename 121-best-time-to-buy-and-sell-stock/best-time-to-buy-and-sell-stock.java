class Solution {
    public int maxProfit(int[] prices) {
int maxp=0,minp=prices[0];
for(int i=0;i<prices.length;i++){
    int current=prices[i];
    if(current<minp){
        minp=current;
    }
    int currentP=prices[i]-minp;
if(currentP>maxp){
    maxp= currentP;
}
}
return maxp;


}}