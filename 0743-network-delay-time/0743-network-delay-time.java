class Solution {
     static class Edge{
        int src;
        int dest;
        int wt;
        public  Edge(int s, int d ,int w) {
             this.src = s;
             this.dest = d;
             this.wt = w;
        }
    }
    static class Pair implements Comparable<Pair> {
         int n;
         int path;

         public Pair(int n , int path) {
             this.n = n;
             this.path = path;
         }
         public int compareTo(Pair p2) {
             return this.path - p2.path;
         }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge>graph[] = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i < times.length; i++) {
             int u = times[i][0];
             int v = times[i][1];
             int wt = times[i][2];
             graph[u].add(new Edge(u , v , wt));
        }
    
  
        //  int dist[] = new int[graph.length];
        //  for(int i  = 0; i < dist.length; i++) {
        //      if(i != src) {
        //          dist[i] = Integer.MAX_VALUE;
        //      }
        //  }
        //  boolean vis[] = new boolean[graph.length];

        //  PriorityQueue<Pair>pq = new PriorityQueue<>();
        //  pq.add(new Pair(src , 0));
         int[] dist = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[k] = 0;

        boolean[] vis = new boolean[n + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k, 0));

         while(!pq.isEmpty()) {
             Pair curr = pq.remove();
             if(!vis[curr.n]) {
                vis[curr.n] = true;
                for(int i = 0; i < graph[curr.n].size(); i++) {
                     Edge e = graph[curr.n].get(i);
                     int u = e.src;
                     int v = e.dest;
                     int wt = e.wt;
                     if(dist[u]+wt < dist[v]) {
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v , dist[v]));
                     }
                }
             }
         }
        int maxTime = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            maxTime = Math.max(maxTime, dist[i]);
        }

        return maxTime;
   }  
}