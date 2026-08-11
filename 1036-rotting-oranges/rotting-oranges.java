class Solution {
    public int orangesRotting(int[][] grid) {
     Queue<int[]>  q=new LinkedList<>();
     int fresh=0;
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==2){
                q.add(new int[]{i,j});
            }
            if(grid[i][j]==1){
                fresh++;
            }}}
            int min=0;
            while(!q.isEmpty()&& fresh>0){
                int size=q.size();
                for(int k=0;k<size;k++){
                   int[] current=q.poll();
                int i=current[0];
                int j=current[1];
                
                if(i-1>=0 && grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    fresh--;
                    q.add(new int[]{i-1,j});
                }

                if(i+1<grid.length && grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    fresh--;
                    q.add(new int[]{i+1,j});
            }

                if(j-1>=0 && grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    fresh--;
                    q.add(new int[]{i,j-1});

        
     }
        
                if(j+1<grid[i].length && grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    fresh--;
                    q.add(new int[]{i,j+1});
                }}
    min++;
}
if(fresh>0){
    return -1;
}
return min;}}