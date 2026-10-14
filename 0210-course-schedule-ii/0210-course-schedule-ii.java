class Solution {
    static class Edge {
        int src;
        int dest;
        public Edge(int s , int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int result[]  = new int[numCourses];
        ArrayList<Edge>graph[] = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < prerequisites.length; i++) {
             int u =  prerequisites[i][1];
             int v =  prerequisites[i][0];

             graph[u].add(new Edge(u , v));
        }
        boolean vis[] = new boolean[graph.length];
        boolean restack[] = new boolean[graph.length];
        Stack<Integer>s = new Stack<>();

        for(int i = 0; i < graph.length; i++) {
             if(!vis[i]) {
                if(topsortUtil(graph , i , vis , restack , s)) {
                    return new int[0];
                }

             }
        }
      int k = 0;
      while(!s.isEmpty()) {
         result[k] = s.pop();
         k++;
      }
      return result;
    }
    public boolean topsortUtil(ArrayList<Edge>graph[], int curr , boolean vis[], boolean restack[] , Stack<Integer>s) {
         vis[curr] = true;
         restack[curr] = true;
         for(int i = 0 ; i < graph[curr].size(); i++) {
             Edge e = graph[curr].get(i);
              if(!vis[e.dest]) {
                 if(topsortUtil(graph , e.dest , vis, restack ,s)) {
                    return true;
                 }
              } else if(restack[e.dest]) {
                return true;
              }
         }
         restack[curr] = false;
         s.push(curr);
         return false;
    }
}