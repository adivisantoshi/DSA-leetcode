class Solution {
    public int climbStairs(int n) {
                int next,prev,cu,ans=0;;
     if (n==0||n==1){
        return 1;
     }
           prev=1;
      cu=1;
     for(int i=2;i<=n;i++){
        next=prev+cu;
    prev=cu;
    cu=next;
     ans=cu;
       
     }
     return ans;        
        }
}