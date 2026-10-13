class Solution {

    static class Edge{
        int src;
        int dest;
        public  Edge(int s , int d) {
             this.src = s;
             this.dest = d;
        }
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Edge>graph[] = new ArrayList[numCourses];
        for(int i = 0 ; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];

            graph[u].add(new Edge(u , v));
        }
            


        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
                if(isCyclic(graph , i , vis , stack)) {
                     return false;
                }
            }
        }
        return true;
    }
    public boolean isCyclic(ArrayList<Edge>graph[], int curr , boolean vis[] , boolean stack[]) {
         vis[curr] = true;
         stack[curr] = true;

         for(int i = 0; i < graph[curr].size(); i++) {
             Edge e = graph[curr].get(i);
             if(stack[e.dest]) {
                 return true;
             }
             if(!vis[e.dest]) {
                if(isCyclic(graph , e.dest , vis , stack)) {
                    return true;
                }
             }
         }
         stack[curr] = false;
         return false;
    }
}