class Solution {
    public int possibleStringCount(String word) {
        /* 
        i can save the freq of each element in a hashmap to track the extra freq for each char. then if its greater then one then i can add those number in the result.
        */

        // Map<Character, Integer> fq = new HashMap<>();

        // for(int i=0; i< word.length();i++){
        //     fq.put(word.charAt(i), fq.getOrDefault(word.charAt(i), 0) + 1);
        // }

        // int result = 1; // 1 as original word is one of the combination

        // for(Map.Entry<Character, Integer> entry : fq.entrySet()){
        //     if(entry.getValue() > 1){
        //         result += entry.getValue() -1;
        //     }
        // }

        int l = 0; 
        int r = 1;
        int result = 1;

        while(r <  word.length()){
            if(word.charAt(l) != word.charAt(r)){
                l = r;
                r++;
            }
            while(r<word.length() && (word.charAt(l) == word.charAt(r))){
                result++;
                r++;
            }
            
        }



        return result;
        
    }
}