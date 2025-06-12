class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int j=0, n = nums.length;
        int maxDiff = Math.abs(nums[0] - nums[n-1]);
        int diff = 0;
        for(int i= 1; i<n; i++, j++){
            diff = Math.abs((nums[i] - nums[j]));
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}