class Solution {
    public int fib(int n) {
int pre2=0,pre=1;
int cur=0;
if(n<=1){
    return n;
}
for(int i=2;i<=n;i++){
    cur=pre+pre2;
    pre2=pre;
    pre=cur;
}
     return cur;
}

  }