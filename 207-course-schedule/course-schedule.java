class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       int count=0;
       List<List<Integer>> adj=new ArrayList<>(); 
       for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());
       }
       int[] indegree=new int[numCourses];
       for(int[] pair:prerequisites){
        int course=pair[0];
        int prerequisite=pair[1];
        adj.get(prerequisite).add(course);
        indegree[course]++;}
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
        q.add(i);}}
        while(!q.isEmpty()){
        int current=q.poll();
     count++;
     for(int next:adj.get(current)){
     indegree[next]--;
     if(indegree[next]==0){
     q.add(next);
    }
}}
return count==numCourses;}}