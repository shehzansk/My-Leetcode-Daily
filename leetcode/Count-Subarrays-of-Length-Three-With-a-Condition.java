class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int count=0;
        int j = 0;
        for(int i =0;i<n;i++){

            j = i+2;
            if(j+1>n) break;
            

            // for(int j =i ; j<i+3 && j<n; i++){
            //     int k = i+3;

            if((nums[i] + nums[j]) == (float)nums[i+1]/2){
                count++;
            }
            // }
        }
        return count;
    }
}