class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0; i < n ; i++) {
             for(int j = 0; j < m; j++) {
                 if(grid[i][j] == 0) {
                    if(helper(grid , i , j)) {
                     count++;
                    }
                 }
             }
        }
        return count;
    }
    public boolean helper(int grid[][] , int sr , int sc) {
 
     if(sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length ) {
         return false;
     }
     if(grid[sr][sc] == 1) {
        return true;
     }
     grid[sr][sc] = 1;
      boolean up =  helper(grid , sr-1 , sc);
      boolean down =   helper(grid , sr+1 , sc);
      boolean right =  helper(grid , sr  , sc+1);
      boolean left =   helper(grid , sr  , sc-1);
      return down && up && right && left;
    }
}