class Solution {
    public int strStr(String haystack, String needle) {

        int  n = haystack.length(), m = needle.length(), nr = 0;

        for(int r=0; r<n; r++){

            if(haystack.charAt(r) == needle.charAt(nr)){
                nr++;
            }

            else{
                r = r-nr;
                nr = 0;
     
            }

            if(nr == m) return r-m+1;
            
        }
        return -1;
        
    }
}