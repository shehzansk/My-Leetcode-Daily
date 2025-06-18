class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] ans = new int[n/3][];
        int[] visited = new int[n];
        Arrays.fill(visited, 0);

        int m = 0;

        for(int i=0; i<n; i++){
            if (visited[i] == 1) continue;
            ans[m] = new int[3];
            ans[m][0] = nums[i];
            visited[i] = 1;
            int l = 1;
            int min = nums[i], max = nums[i];
            for(int j = i+1; j<n; j++){
                if (visited[j] == 0) {
                    int newMin = Math.min(min, nums[j]);
                    int newMax = Math.max(max, nums[j]);
                    if (newMax - newMin <= k) {
                        ans[m][l++] = nums[j];
                        visited[j] = 1;
                        min = newMin;
                        max = newMax;
                    }
                }
                if (l == 3) break;
                
            }
            if(l != 3) return new int[0][0];

            m++;
        }

        return ans;


    }
}