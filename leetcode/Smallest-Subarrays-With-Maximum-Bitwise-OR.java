class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
  
        Arrays.fill(ans, 1);

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int j = i - 1;
 
            while (j >= 0 && (nums[j] | x) != nums[j]) {
                nums[j] |= x;
                ans[j] = i - j + 1;
                j--;
            }
        }

        return ans;
    }
}
