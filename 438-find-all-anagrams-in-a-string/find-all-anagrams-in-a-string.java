class Solution {
    public List<Integer> findAnagrams(String s, String p) {
 List<Integer> ans=new ArrayList<>();
 int[] fre1= new int[26];
 int[] fre2=new int[26];
 for(int i=0;i<p.length();i++){
    char ch=p.charAt(i);
    fre1[ch-'a']++;
 }if(p.length()<=s.length()){
 for(int i=0;i<p.length();i++){
    char ch=s.charAt(i);
    fre2[ch-'a']++;
    
 }
 if(Arrays.equals(fre1,fre2)){
 ans.add(0);
 }
 for(int i=p.length();i<s.length();i++){
    char l=s.charAt(i-p.length());
    fre2[l-'a']--;
    char r=s.charAt(i);
    fre2[r-'a']++;
 if(Arrays.equals(fre1,fre2)){
    ans.add(i-p.length()+1);
 }}}
 return ans;
    }
}