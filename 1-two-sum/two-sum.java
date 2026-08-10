class Solution {
    public int[] twoSum(int[] nums, int target) {
 int i,j;
 for(i=0;i<nums.length;i++){
    for(j=nums.length-1;j>0;j--){
        if(nums[i]+nums[j]==target && i!=j){
            return new int[]{i,j};
        }
    }
 }
 return new int[]{};
 }
 }