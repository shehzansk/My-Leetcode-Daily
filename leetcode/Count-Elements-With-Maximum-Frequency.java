class Solution {
    public int maxFrequencyElements(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();

        for(int n: nums) mp.put(n, mp.getOrDefault(n, 0)+1);

        int count = 0;
        int maxFq = 0;
        for(int v:mp.values()) {
            maxFq = Math.max(maxFq, v);
        }
        for(int v:mp.values()) {
           if(v==maxFq) count+=v;
        }

        return count;
        
    }
}