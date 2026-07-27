class Solution {
    public boolean checkInclusion(String s1, String s2) {
   int[] arr=new int[26];
   int[] fre=new int[26];
     for(int i=0;i<s1.length();i++){
    char ch=s1.charAt(i);
    arr[ch-'a']++;
 }  
 if(s1.length()<=s2.length()){  
 for(int i=0;i<s1.length();i++){
    char ch=s2.charAt(i);
    fre[ch-'a']++;
 }
    if(Arrays.equals(arr,fre))
    {
        return true;
 }
 for(int i=s1.length();i<s2.length();i++){
    char left=s2.charAt(i-s1.length());
    fre[left-'a']--;
    char r=s2.charAt(i);
    fre[r-'a']++;
  if(Arrays.equals(arr,fre))
    {
        return true;
 }  
    
 }}
 return false;
   }

        }
            
