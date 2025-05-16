class Solution {
    public boolean hammingDistance(String s1, String s2){
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) count++;
            if(count > 1) return false;
        }
        return count == 1;
    }

    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        int[] dp = new int[n]; 
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLen = 1;
        int lastIndex = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(groups[i] != groups[j] &&
                   words[i].length() == words[j].length() &&
                   hammingDistance(words[i], words[j])) {

                    if(dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                    }
                }
            }

            if(dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        List<String> ans = new ArrayList<>();
        while(lastIndex != -1) {
            ans.add(0, words[lastIndex]); 
            lastIndex = prev[lastIndex];
        }

        return ans;
    }
}
