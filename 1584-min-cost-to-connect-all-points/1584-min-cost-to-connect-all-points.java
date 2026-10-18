class Solution {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s , int d , int wt) {
             this.src = s;
             this.dest = d;
             this.wt = wt;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        ArrayList<Edge>graph[] = new ArrayList[points.length];
        for(int i = 0 ; i < graph.length; i++) {
             graph[i] = new ArrayList<>();
        }
       for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int wt = Math.abs(points[i][0] - points[j][0])
                       + Math.abs(points[i][1] - points[j][1]);

                graph[i].add(new Edge(i, j, wt));
                graph[j].add(new Edge(j, i, wt));
            }
        }
        return prims(graph);
    }
    static class Pair implements Comparable<Pair>{
         int v;
         int cost;
         public Pair(int v , int c) {
            this.v = v;
            this.cost = c;
         }
         public int compareTo(Pair p2) {
             return this.cost - p2.cost;
         }
    }
    public int prims(ArrayList<Edge>graph[]) {
         boolean vis[] = new boolean[graph.length];
         PriorityQueue<Pair>pq = new PriorityQueue<>();
         pq.add(new Pair(0 , 0));
         int finalcost = 0;
         while(!pq.isEmpty()) {
             Pair curr = pq.remove();
             if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalcost   += curr.cost;
                for(int i =0; i < graph[curr.v].size(); i++) {
                     Edge e = graph[curr.v].get(i);
                     pq.add(new Pair(e.dest , e.wt));
                }
             }
         }
         return finalcost;
    }
}