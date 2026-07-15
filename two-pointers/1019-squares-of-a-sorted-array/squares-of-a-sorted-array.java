class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int [] a=new int[nums.length];
        int k=nums.length-1;
        while(i<=j){
             if( Math.abs(nums[i])>Math.abs(nums[j])){
            a[k]=nums[i]*nums[i];
            i++;}
            else{

            a[k]=nums[j]*nums[j];
j--;}
            

            k--;
            }

            
            
            return a;
        }
    }
