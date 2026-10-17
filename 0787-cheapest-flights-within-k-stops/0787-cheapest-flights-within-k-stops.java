class Solution {
    static class Edge{
         int src;
         int dest;
         int wt;
         public Edge(int s ,int d, int w) {
             this.src = s;
             this.dest = d;
             this.wt = w;
         }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
         ArrayList<Edge>graph = new ArrayList<>();
         for(int i = 0; i < flights.length; i++) {
             int u = flights[i][0];
             int v = flights[i][1];
             int wt = flights[i][2];
             graph.add(new Edge(u , v, wt));
         }
         return bellmanford(graph, n , src , dst , k);
    }
    public static int bellmanford(ArrayList<Edge>graph,int n, int src , int dst , int k ) {
         int dist[] = new int[n];
         for(int i = 0; i < dist.length; i++) {
             if(i != src) {
                 dist[i] = Integer.MAX_VALUE;
             }
         }
         for(int i = 0; i <= k; i++) {
            int temp[] = dist.clone();
            for(int j = 0; j < graph.size(); j++) {
                   Edge e = graph.get(j);
                   int u = e.src;
                   int v = e.dest;
                   int wt = e.wt;
                   if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < temp[v]) {
                       temp[v] = dist[u]+wt;
               }
            }
            dist = temp;
         }
          if (dist[dst] == Integer.MAX_VALUE) {
            return -1;
        }

        return dist[dst];

    }
}