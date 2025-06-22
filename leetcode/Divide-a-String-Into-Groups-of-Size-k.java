class Solution {
    public String[] divideString(String s, int k, char fill) {

        int n = s.length();
        int m = (n-1 + k) / k;
        String[] ans = new String[m];
        int j = 0;
        for(int i=0; i<n; i+=k){
            if(i+k > n){
                int extra = (i + k) - n;
                String temp  = s.substring(i, n);
                while(extra>0){
                    temp += fill;
                    extra--;
                }
                ans[j] = temp;
                j++;
            }
            else ans[j] = s.substring(i, i+k);
            j++;
        }
        return ans;
    }
}