class Solution {
    static class Edge{
         int src;
         int dest;

         public Edge(int s , int d){
            this.src = s;
            this.dest = d;
         }
    }
    public boolean isBipartite(int[][] edges) {
        ArrayList<Edge>adj[] = new ArrayList[edges.length];
        for(int i = 0; i < edges.length ; i++) {
         adj[i] = new ArrayList<>();
       }
       for(int i = 0; i < edges.length; i++) {
          for(int j = 0; j < edges[i].length; j++) {
             int u = i;
             int v = edges[i][j];
             adj[u].add(new Edge(u , v));
          }
       }
       
       return Bipartite(adj);

    }
    public boolean Bipartite(ArrayList<Edge>graph[]) {
        int col[] = new int[graph.length];
        for(int i = 0; i < col.length; i++) {
             col[i] = -1;
        }
        Queue<Integer>q = new LinkedList<>();
        for(int i = 0; i < graph.length; i++) {
             if(col[i] == -1) {
                 q.add(i);
                 col[i] = 0;
                 while(!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j = 0; j < graph[curr].size(); j++) {
                         Edge e = graph[curr].get(j);
                         if(col[e.dest] == -1) {
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextcol;
                            q.add(e.dest);
                         } else if(col[e.dest] == col[curr]) {
                            return false;
                         }
                    }
                 }
             }
        }
        return true;
    }
}