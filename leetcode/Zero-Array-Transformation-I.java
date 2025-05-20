class Solution {

    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diff = new int[nums.length + 1];

        for(int i =0 ; i<queries.length; i++){
            int low = queries[i][0];
            int high = queries[i][1];

            diff[low] -= 1;
            if(high + 1 < diff.length) {
                diff[high + 1] += 1;
            }

            // for(int j=low; j<=high; j++){
            //     nums[j]--;
            // }
        }

        int curr = 0;
        for(int i = 0; i < nums.length; i++) {
            curr += diff[i];
            nums[i] += curr; 
        }

        for(int i =0; i<nums.length; i++){
            if(nums[i] > 0) return false;
        }

        return true;
    }
}