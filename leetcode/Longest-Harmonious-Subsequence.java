class Solution {
    public int findLHS(int[] nums) {

        int max = 0;
        int n = nums.length;
        Arrays.sort(nums);

        int low = 0;

        for(int i =1;i<n;i++){
            int diff =  nums[i] - nums[low];
            while (nums[i] - nums[low] > 1) {
                low++;
            }

            if (nums[i] - nums[low] == 1) {
                max = Math.max(max, i - low + 1);
            }
            
        }

        return max;
        
    }
}