class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b) -> b - a);
        for(int i = 0; i < n; i++) {
            pq.add(stones[i]);
        }
        while(pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            if(first != second) {
                pq.add(first - second);
            }
        }
        if(pq.isEmpty()) {
            return 0;
       } 
       return pq.peek();
        
    }
}