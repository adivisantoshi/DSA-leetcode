class Solution {
        public int f(int nums[],int s,int n){
            int prev=nums[s];
            int prev2=0;
            for(int i=s+1;i<n;i++){
                int t=nums[i]+prev2;
                int not=0+prev;
                int cur=Math.max(t,not);
                prev2=prev;
                prev=cur;
            }
            return prev;
        }
    public int rob(int[] nums) {
if(nums.length==1) return nums[0];
return Math.max(f(nums,0,nums.length-1),f(nums,1,nums.length));
    }
}