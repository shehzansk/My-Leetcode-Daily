class Solution {
    public double calcualte(int[] piles, int ind){
        double ans = 0;

        for(int i =0; i<piles.length; i++){
            ans += Math.ceil((double)piles[i]/(double)ind);
        }
        return ans;
    }

    public int maxc(int[] piles){
        int max =0;
        for(int i=0; i<piles.length;i++){
            max = Math.max(max, piles[i]);
        }

        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int max = maxc(piles);
        int low = 0, high = max;
        int ans = 0;

        while(low<=high){
            int mid = low + (high-low)/2;

            if((int)calcualte(piles, mid) <= h){
                // ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return low;

         
    }
}