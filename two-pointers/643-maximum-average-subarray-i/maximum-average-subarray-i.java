class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double maxavg=0.000;
    int l=0,r=k-1,sum;
    int maxs=Integer.MIN_VALUE;
    while(r<nums.length){
        sum=0;
       for(int i=l;i<=r;i++){
    
         sum+=nums[i];
       }
         if(sum>maxs){
    maxs=sum;
}

maxavg=(double) maxs / k;
    
        l++;
        r++;
       
    }
    return maxavg;
    }
}