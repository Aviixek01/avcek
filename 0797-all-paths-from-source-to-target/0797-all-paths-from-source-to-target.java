class Solution {
     static class Edge {
         int src;
         int dest;
         public Edge(int s , int d) {
             this.src = s;
             this.dest = d;
         }
     }
    public List<List<Integer>> allPathsSourceTarget(int[][] arr) {
        ArrayList<Edge>graph[] = new ArrayList[arr.length];
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
           for(int j = 0; j < arr[i].length; j++) {
              int u = i;
              int v = arr[i][j];
              graph[u].add(new Edge(u , v));
           }
        }
        List<List<Integer>>result = new ArrayList<>();
        printall(graph , 0 , arr.length-1, "0" , result);
        return result;
        
    }
    public static void printall(ArrayList<Edge>graph[], int src , int dest , String path , List<List<Integer>>result) {
        if(src == dest) {

         List<Integer>temp = new ArrayList<>();
          for (String s : path.split(" ")) {
                temp.add(Integer.parseInt(s));
            }

            result.add(temp);
            return;
            
        }
        for(int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printall(graph , e.dest , dest , path+ " "+e.dest , result);
        }
    }
}