class Solution {
    public boolean willB(int[] nums, int m, int day, int k){

        int cnt = 0;
        int noOfB = 0;

        for(int i=0; i<nums.length; i++){
            if(day >= nums[i]){
                cnt++;
            }
            else{
                noOfB += (cnt)/k;
                cnt = 0;
            }
            

            
        }
        noOfB += (cnt)/k;
        return noOfB >= m;
    }


    public int minDays(int[] bloomDay, int m, int k) {
        
        long val =(long) m*k;

        if(val > bloomDay.length) return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int b: bloomDay){
            min = Math.min(min, b);
            max = Math.max(max, b);
        }


        while(min <= max){
            int mid = min+(max-min)/2;

            if(willB(bloomDay, m, mid, k)){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }

        return min;
    }
}