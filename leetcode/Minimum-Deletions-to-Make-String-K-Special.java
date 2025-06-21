class Solution {
    public int minimumDeletions(String word, int k) {
        
        Map<Character, Integer> fq = new HashMap<>();
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        int n = word.length();

        for(int i = 0; i<n ;i++){
            fq.put(word.charAt(i), fq.getOrDefault(word.charAt(i), 0)+1);

            // max = Math.max(max, fq.get(word.charAt(i)));
            // min = Math.min(min, fq.get(word.charAt(i)));
        }

        List<Integer> freqs = new ArrayList<>(fq.values());
        Collections.sort(freqs);

        int minD = Integer.MAX_VALUE;

        for (int i = 0; i < freqs.size(); i++) {
            int base = freqs.get(i);
            int del = 0;

            for (int j = 0; j < freqs.size(); j++) {
                int freq = freqs.get(j);
                if (freq < base) {
                    del += freq; 
                } else if (freq > base + k) {
                    del += freq - (base + k); 
                }
            }

            minD = Math.min(minD, del);
        }

        return minD;
    }
}