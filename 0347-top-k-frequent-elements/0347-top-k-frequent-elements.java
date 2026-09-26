class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        int result[] = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

       return result;
    }
}