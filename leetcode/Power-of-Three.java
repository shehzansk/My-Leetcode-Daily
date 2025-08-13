class Solution {
    public boolean isPowerOfThree(int n) {

        double ans = n;
        
        if(n == 1) return true;
        while(true){
            ans = ans/3;

            if(ans == 1.0) break;
            if(ans <=0) return false;
        }

        return true;
        
    }
}