class Solution {
    public int findLucky(int[] arr) {

        int n = arr.length;
        int lucky = -1;

        Map<Integer, Integer> fq = new HashMap<>();

        for(int a: arr){
            fq.put(a, fq.getOrDefault(a, 0)+1);
        }

        int l = -1;

        for(Map.Entry<Integer, Integer> e : fq.entrySet()){
            if(e.getKey() == e.getValue()){
                l = e.getKey();
            }

            lucky = Math.max(lucky, l);
        }

        return lucky;
        
    }
}