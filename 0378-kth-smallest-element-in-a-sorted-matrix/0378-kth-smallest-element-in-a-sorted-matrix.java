class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int x = matrix.length;
        int y = matrix[0].length;
        
        int res[] = new int[x*y];
        int m = 0;
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                res[m] = matrix[i][j];
                m++;
            }
        }
        Arrays.sort(res);
        for(int i = 0; i < res.length; i++) {
            if(i+1 == k) {
                return res[i];
            }
        }
      return -1;  
    }
}