class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int maxsum = 0;
        int left = 0; 
        Set<Integer> ans = new HashSet<>(); 
        int sum = 0;
        for(int j = 0; j<nums.length; j++){
            if(ans.contains(nums[j])){
                while(ans.contains(nums[j])){
                    sum -= nums[left];
                    ans.remove(nums[left]);
                    left++;
                }
            }
            sum+= nums[j];
            ans.add(nums[j]);
            maxsum = Math.max(maxsum, sum);

        }

        return maxsum;
        
    }
}