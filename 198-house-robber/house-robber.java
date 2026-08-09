class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int two,one;
  two=nums[0];
  one=Math.max(nums[0],nums[1]);
  int current,skip,best=0;
  for(int i=2;i<nums.length;i++){
    current=two+nums[i];
    skip=one;
  best=Math.max(current,skip);
  two=one;
  one=best;
  }
  return best;

    }
}