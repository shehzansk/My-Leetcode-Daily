class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];

        int maxsum = 0;

        for(int i =1; i< nums.length; i++){
            min = Math.min(min, nums[i]);
            maxsum = Math.max(maxsum, nums[i] - min);
        }

        if (maxsum == 0) return -1;
        return maxsum;
        
    }
}