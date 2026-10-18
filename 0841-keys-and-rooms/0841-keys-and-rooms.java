class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer>q = new LinkedList<>();
        boolean vis[] = new boolean[rooms.size()];
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!vis[curr]) {
                vis[curr] = true;
            }
            for(int i = 0; i < rooms.get(curr).size(); i++) {
                int dest = rooms.get(curr).get(i);
                if(!vis[dest])
                q.add(dest);
            }
        }
      for(int i = 0; i < vis.length; i++) {
         if(!vis[i]) {
            return false;
         }
      }
      return true;
    }
}