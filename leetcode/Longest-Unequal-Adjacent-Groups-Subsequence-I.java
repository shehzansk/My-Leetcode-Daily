class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        if(n == 1){
            return ans; 
        } 

        int j = 0;
        for(int i =1; i< n; i++){
            if((groups[i] != groups[i-1]) ){
                ans.add("" + words[i]);
                
            }
            
        }
        return ans;
    }
}