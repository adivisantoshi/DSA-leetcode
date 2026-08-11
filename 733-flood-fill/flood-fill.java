class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     int og=image[sr][sc];
     if(og==color) return image;
     dfs(image,sr,sc,color,og);
     return image;
    }
    void dfs(int[][] image,int sr,int sc,int color,int og){
   if(sr<0||sr>=image.length||sc<0||sc>=image[sr].length){
    return;
   }
   if(image[sr][sc]!=og){
    return;
   }
   image[sr][sc]=color;          
   dfs(image,sr-1,sc,color,og);
   dfs(image,sr+1,sc,color,og);
   dfs(image,sr,sc-1,color,og);
   dfs(image,sr,sc+1,color,og);
    }
}