class Solution {
    enum Visit {
        NOT_VISIT, VISIT
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> course = new ArrayList<>(numCourses);
        Visit[] visited = new Visit[numCourses];
        
        for(int i = 0; i < numCourses; i++){
            course.add(new ArrayList<>());
        }
        
        for(int[] pre : prerequisites){
            course.get(pre[1]).add(pre[0]);
        }
        
        for(int i = 0; i < numCourses; i++){
            if(dfs(course, visited, i)){
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(ArrayList<ArrayList<Integer>> course, Visit[] visited, int courseIndex){
        if(visited[courseIndex] == Visit.VISIT){
            return true;
        } else if(visited[courseIndex] == Visit.NOT_VISIT){
            return false;
        }
        
        visited[courseIndex] = Visit.VISIT;
        
        for(int next : course.get(courseIndex)){
            if(dfs(course, visited, next)){
                return true;
            }
        }
        
        visited[courseIndex] = Visit.NOT_VISIT;
        
        return false;
    }
}