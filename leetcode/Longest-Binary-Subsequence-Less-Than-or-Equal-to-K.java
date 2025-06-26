class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int len = Integer.toBinaryString(k).length();
        if(n <= len-1){
            return n;
        }
        int ans = len-1;
        String madeUp = "1"+ s.substring(n - len+1);
        int curr = Integer.parseInt(madeUp, 2);

        if( curr<=k || s.charAt(n-len) == '0' ){
            ans++;
        }
        for(int i = 0;i<(n-len);i++){
            if(s.charAt(i) == '0'){
                ans++;
            }
        }
        return ans;
    }
}