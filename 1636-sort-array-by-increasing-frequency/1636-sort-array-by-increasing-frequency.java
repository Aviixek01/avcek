class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        }
        ArrayList<Integer>list = new ArrayList<>(map.keySet());
        // Collections.sort(list , (a,b) -> map.get(a) - map.get(b));
        Collections.sort(list, (a, b) -> {
        if(map.get(a) != map.get(b)) {
        return map.get(a) - map.get(b);
        }

        return b - a;
        });

        int arr[] = new int[nums.length];
        int i = 0;
        for(int x : list) {
            int freq  = map.get(x);
            while(freq > 0) {
            arr[i] = x;
            i++;
            freq--;
            }
        }
        return arr;
    }
}