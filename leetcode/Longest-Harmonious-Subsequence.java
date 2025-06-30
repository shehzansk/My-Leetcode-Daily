class Solution {
    public int findLHS(int[] nums) {

        int left = 0;
        int right = 1;
        Arrays.sort(nums); 
        int maxLength = 0;

        while(right<nums.length){
            int difference = nums[right] - nums[left];

            if(difference < 1) {
                right++;
                continue;
            }

            if(difference == 1) {
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }
            else{
                left++;
            }
        }
        return maxLength;
    }
}