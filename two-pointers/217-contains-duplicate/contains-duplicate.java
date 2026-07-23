class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> lol=new HashSet<>();
    for(int n:nums){
        if(lol.contains(n)) return true;
    lol.add(n);
    }
    return false;
}}