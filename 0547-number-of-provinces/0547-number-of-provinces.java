class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        int provinces = 0;
        for(int i = 0; i < n; i++) {
            if(!vis[i]) {
            dfsUtil(isConnected , i , vis);
            provinces++;
         }
        }
        return provinces;
    }
    public void dfsUtil(int[][] isConnected , int curr , boolean vis[]) {
        vis[curr] = true;
        for(int i = 0; i < isConnected.length; i++) {
            if(isConnected[curr][i] == 1 && !vis[i]) {
                dfsUtil(isConnected , i , vis);
            }
        }
    }
}